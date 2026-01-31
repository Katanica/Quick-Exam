package com.example.quickexam.data

import com.example.quickexam.data.local.QuizSetDao
import com.example.quickexam.data.local.QuizSetEntity

class QuizSetRepository(
    private val quizSetDao: QuizSetDao
) {

    suspend fun insert(set: QuizSetEntity) {
        quizSetDao.insert(set)
    }

    suspend fun getAll(): List<QuizSetEntity> {
        return quizSetDao.getAll()
    }

    suspend fun getById(id: Int): QuizSetEntity? {
        return quizSetDao.getById(id)
    }

    suspend fun update(set: QuizSetEntity) {
        quizSetDao.update(set)
    }

    suspend fun delete(set: QuizSetEntity) {
        quizSetDao.delete(set)
    }
}
