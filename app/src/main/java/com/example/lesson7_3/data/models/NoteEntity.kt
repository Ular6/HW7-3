package com.example.lesson7_3.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_entity")
data class NoteEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String,
    @ColumnInfo(name = "created_at")
    val createdAt: Long
)