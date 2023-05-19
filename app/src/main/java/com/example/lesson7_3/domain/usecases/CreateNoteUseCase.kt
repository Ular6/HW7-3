package com.example.lesson7_3.domain.usecases

import com.example.lesson7_3.domain.models.Note
import com.example.lesson7_3.domain.repository.NoteRepository
import javax.inject.Inject


class CreateNoteUseCase @Inject constructor(private val repository: NoteRepository) {

    fun create(note: Note) = repository.createNote(note)
}