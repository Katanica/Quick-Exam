package com.example.quickexam.data.local

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import androidx.room.Index

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = AttemptEntity::class,
            parentColumns = ["attemptId"],
            childColumns = ["attemptId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = QuestionEntity::class,
            parentColumns = ["questionId"],
            childColumns = ["questionId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["attemptId"]),
        Index(value = ["questionId"]),
    ]
)
data class AttemptAnswerEntity (
    @PrimaryKey(autoGenerate = true)
    val attemptAnswerId : Int,

    val attemptId: Int,
    val questionId: Int,
    val chosenOptionIds: String?,
    val userTextAnswer: String?,
    val isCorrect: Boolean,
)