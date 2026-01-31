package com.example.quickexam.data

import com.example.quickexam.data.local.AttemptDao
import com.example.quickexam.data.local.AttemptEntity

class AttemptRepository(
    private val attemptDao: AttemptDao
) {

    suspend fun insert(set: AttemptEntity) {
        attemptDao.insert(set)
    }

    suspend fun getAll(): List<AttemptEntity> {
        return attemptDao.getAll()
    }

    suspend fun getById(id: Int): AttemptEntity? {
        return attemptDao.getById(id)
    }

    suspend fun update(set: AttemptEntity) {
        attemptDao.update(set)
    }

    suspend fun delete(set: AttemptEntity) {
        attemptDao.delete(set)
    }
}
