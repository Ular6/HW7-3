package com.example.lesson7_3.data.di

import android.content.Context
import androidx.room.Room
import com.example.lesson7_3.data.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Provides
    fun database(@ApplicationContext context: Context): AppDatabase =
        Room.databaseBuilder(context, AppDatabase::class.java, "Note-DB").build()

    @Provides
    fun noteDao(appDatabase: AppDatabase) = appDatabase.noteDao()
}
