package com.example.lesson7_3.data.di

import com.example.lesson7_3.data.repository.NoteRepositoryImpl
import com.example.lesson7_3.domain.repository.NoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun noteRepository(noteRepositoryImpl: NoteRepositoryImpl): NoteRepository

}
