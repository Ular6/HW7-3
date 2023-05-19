package com.example.lesson7_3.presentation.notes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lesson7_3.domain.models.Note
import com.example.lesson7_3.domain.usecases.DeleteNoteUseCase
import com.example.lesson7_3.domain.usecases.GetAllNotesUseCase
import com.example.lesson7_3.domain.utils.ResultStatus
import com.example.lesson7_3.presentation.utils.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val getAllNotesUseCase: GetAllNotesUseCase,
    private val deleteNoteUseCase: DeleteNoteUseCase
) : ViewModel() {

    private val _notesState = MutableStateFlow<UIState<List<Note>>>(UIState.Loading())
    val notesState: StateFlow<UIState<List<Note>>> = _notesState.asStateFlow()

    init {
        getAllNotes()
    }

    fun getAllNotes() {
        viewModelScope.launch {
            getAllNotesUseCase.getAllNotes().collect {
                when (it) {
                    is ResultStatus.Error -> {
                        _notesState.value = UIState.Error(it.message)
                    }

                    is ResultStatus.Loading -> {
                        _notesState.value = UIState.Loading()
                    }

                    is ResultStatus.Success -> {
                        if (it.data != null)
                            _notesState.value = UIState.Success(it.data)
                        else _notesState.value =
                            UIState.Error("List is Empty! Please add some notes.")
                    }
                }
            }
        }
    }
}