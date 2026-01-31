package com.example.quickexam.data

import com.example.quickexam.data.local.AnswerOptionDao
import com.example.quickexam.data.local.AnswerOptionEntity

class AnswerOptionRepository(
    private val answerOptionDao: AnswerOptionDao
) {

    suspend fun insert(set: AnswerOptionEntity) {
        answerOptionDao.insert(set)
    }

    suspend fun getAll(): List<AnswerOptionEntity> {
        return answerOptionDao.getAll()
    }

    suspend fun getById(id: Int): AnswerOptionEntity? {
        return answerOptionDao.getById(id)
    }

    suspend fun update(set: AnswerOptionEntity) {
        answerOptionDao.update(set)
    }

    suspend fun delete(set: AnswerOptionEntity) {
        answerOptionDao.delete(set)
    }
}