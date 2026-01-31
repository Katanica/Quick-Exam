package com.example.quickexam.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface AttemptDao{
    @Insert
    suspend fun insert(set: AttemptDao)

    @Query("SELECT * FROM AttemptEntity")
    suspend fun getAll(): List<AttemptEntity>

    @Delete
    suspend fun delete(set: AttemptEntity)

    @Update
    suspend fun update(set: AttemptEntity)
}