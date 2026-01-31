package com.example.quickexam.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface AnswerOptionDao{
    @Insert
    suspend fun insert(set: AnswerOptionEntity)

    @Query("SELECT * FROM AnswerOptionEntity")
    suspend fun getAll(): List<AnswerOptionEntity>

    @Query("SELECT * FROM AnswerOptionEntity WHERE optionId = :id")
    suspend fun getById(id : Int): AnswerOptionEntity?

    @Delete
    suspend fun delete(set: AnswerOptionEntity)

    @Update
    suspend fun update(set: AnswerOptionEntity)
}