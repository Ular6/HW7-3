package com.example.lesson7_3.domain.repository

import com.example.lesson7_3.domain.models.Note
import com.example.lesson7_3.domain.utils.ResultStatus
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getAllNotes(): Flow<ResultStatus<List<Note>>>
    fun deleteNote(note: Note) : Flow<ResultStatus<Unit>>
    fun createNote(note: Note) : Flow<ResultStatus<Unit>>
    fun updateNote(note: Note): Flow<ResultStatus<Unit>>
}