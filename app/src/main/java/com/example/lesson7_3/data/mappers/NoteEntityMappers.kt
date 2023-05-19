package com.example.lesson7_3.data.mappers

import com.example.lesson7_3.data.models.NoteEntity
import com.example.lesson7_3.domain.models.Note

fun Note.toNoteEntity(): NoteEntity {
    return NoteEntity(
        id, title, description, createdAt
    )
}

fun NoteEntity.toNote(): Note {
    return Note(
        id, title, description, createdAt
    )
}