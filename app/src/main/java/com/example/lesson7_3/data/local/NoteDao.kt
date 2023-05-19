package com.example.lesson7_3.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.lesson7_3.data.models.NoteEntity

@Dao
interface NoteDao {

    @Delete
    suspend fun delete(noteEntity: NoteEntity)

    @Insert
    suspend fun create(noteEntity: NoteEntity)

    @Update
    suspend fun update(noteEntity: NoteEntity)

    @Query("SELECT * FROM note_entity")
    suspend fun getAllNotes(): List<NoteEntity>
}