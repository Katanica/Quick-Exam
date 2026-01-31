package com.example.quickexam.data.local

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = QuestionEntity::class,
            parentColumns = ["questionId"],
            childColumns = ["questionId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["questionId"])]
)
data class AnswerOptionEntity (
    @PrimaryKey(autoGenerate = true)
    val optionId: Int,

    val questionId: Int,
    val textval : String,
    val isCorrect: Boolean,
)