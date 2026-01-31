package com.example.quickexam.data

import com.example.quickexam.data.local.AttemptAnswerDao
import com.example.quickexam.data.local.AttemptAnswerEntity
import com.example.quickexam.data.local.AttemptEntity

class AttemptAnswerRepository(
    private val attemptAnswerDao: AttemptAnswerDao
) {

    suspend fun insert(set: AttemptAnswerEntity) {
        attemptAnswerDao.insert(set)
    }

    suspend fun getAll(): List<AttemptAnswerEntity> {
        return attemptAnswerDao.getAll()
    }

    suspend fun getById(id: Int): AttemptAnswerEntity? {
        return attemptAnswerDao.getById(id)
    }

    suspend fun update(set: AttemptAnswerEntity) {
        attemptAnswerDao.update(set)
    }

    suspend fun delete(set: AttemptAnswerEntity) {
        attemptAnswerDao.delete(set)
    }
}