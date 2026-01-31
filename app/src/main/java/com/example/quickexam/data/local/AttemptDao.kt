package com.example.quickexam.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface AttemptDao{
    @Insert
    suspend fun insert(set: AttemptEntity)

    @Query("SELECT * FROM AttemptEntity")
    suspend fun getAll(): List<AttemptEntity>

    @Query("SELECT * FROM AttemptEntity WHERE attemptId = :id")
    suspend fun getById(id : Int): AttemptEntity?

    @Delete
    suspend fun delete(set: AttemptEntity)

    @Update
    suspend fun update(set: AttemptEntity)
}