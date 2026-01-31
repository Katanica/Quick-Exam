package com.example.quickexam.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        QuizSetEntity::class,
        QuestionEntity::class,
        AnswerOptionEntity::class,
        AttemptEntity::class,
        AttemptAnswerEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun quizSetDao(): QuizSetDao
    abstract fun questionDao(): QuestionDao
    abstract fun answerOptionDao(): AnswerOptionDao
    abstract fun attemptDao(): AttemptDao
    abstract fun attemptAnswerDao(): AttemptAnswerDao
}
