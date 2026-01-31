package com.example.quickexam.data.local

import androidx.room.*
import androidx.room.Query

@Dao
interface QuizSetDao{
    @Insert
    suspend fun insert(set: QuizSetDao)

    @Query("SELECT * FROM QuizSetEntity")
    suspend fun getAll(): List<QuizSetEntity>

    @Delete
    suspend fun delete(set: QuizSetEntity)

    @Update
    suspend fun update(set: QuizSetEntity)
}