package com.example.quickexam.data

import com.example.quickexam.data.local.QuestionDao
import com.example.quickexam.data.local.QuestionEntity

class QuestionRepository(
    private val questionDao: QuestionDao
) {

    suspend fun insert(set: QuestionEntity) {
        questionDao.insert(set)
    }

    suspend fun getAll(): List<QuestionEntity> {
        return questionDao.getAll()
    }

    suspend fun getById(id: Int): QuestionEntity? {
        return questionDao.getById(id)
    }

    suspend fun update(set: QuestionEntity) {
        questionDao.update(set)
    }

    suspend fun delete(set: QuestionEntity) {
        questionDao.delete(set)
    }
}
