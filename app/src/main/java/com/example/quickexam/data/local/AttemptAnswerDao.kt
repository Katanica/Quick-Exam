package com.example.quickexam.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface AttemptAnswerDao{
    @Insert
    suspend fun insert(set: AttemptAnswerEntity)

    @Query("SELECT * FROM AttemptAnswerEntity")
    suspend fun getAll(): List<AttemptAnswerEntity>

    @Query("SELECT * FROM AttemptAnswerEntity WHERE attemptAnswerId = :id")
    suspend fun getById(id : Int): AttemptAnswerEntity?


    @Delete
    suspend fun delete(set: AttemptAnswerEntity)

    @Update
    suspend fun update(set: AttemptAnswerEntity)
}