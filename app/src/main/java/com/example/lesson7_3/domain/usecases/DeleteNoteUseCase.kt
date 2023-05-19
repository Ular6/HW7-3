package com.example.lesson7_3.domain.usecases

import com.example.lesson7_3.domain.models.Note
import com.example.lesson7_3.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(private val repository: NoteRepository) {

    fun delete(note: Note) = repository.deleteNote(note)
}