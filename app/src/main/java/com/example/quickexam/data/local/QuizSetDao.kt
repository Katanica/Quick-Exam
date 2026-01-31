package com.example.quickexam.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface QuizSetDao{
    @Insert
    suspend fun insert(set: QuizSetEntity)

    @Query("SELECT * FROM QuizSetEntity")
    suspend fun getAll(): List<QuizSetEntity>

    @Query("SELECT * FROM QuizSetEntity WHERE setId = :id")
    suspend fun getById(id : Int): QuizSetEntity

    @Delete
    suspend fun delete(set: QuizSetEntity)

    @Update
    suspend fun update(set: QuizSetEntity)
}