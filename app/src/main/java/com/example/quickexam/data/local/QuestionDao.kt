package com.example.quickexam.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface QuestionDao{
    @Insert
    suspend fun insert(set: QuestionDao)

    @Query("SELECT * FROM QuestionEntity")
    suspend fun getAll(): List<QuestionEntity>

    @Delete
    suspend fun delete(set: QuestionEntity)

    @Update
    suspend fun update(set: QuestionEntity)
}