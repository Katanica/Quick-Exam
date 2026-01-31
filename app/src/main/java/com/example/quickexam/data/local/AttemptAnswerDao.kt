package com.example.quickexam.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface AttemptAnswerDao{
    @Insert
    suspend fun insert(set: AttemptAnswerDao)

    @Query("SELECT * FROM AttemptAnswerEntity")
    suspend fun getAll(): List<AttemptAnswerEntity>

    @Delete
    suspend fun delete(set: AttemptAnswerEntity)

    @Update
    suspend fun update(set: AttemptAnswerEntity)
}