package com.example.lesson7_3.domain.usecases

import com.example.lesson7_3.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(private val repository: NoteRepository) {

    fun getAllNotes() = repository.getAllNotes()
}