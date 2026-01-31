package com.example.quickexam.data.local

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.example.quickexam.data.enums.QuestionType


@Entity(
    foreignKeys = [
        ForeignKey(
            entity = QuizSetEntity::class,
            parentColumns = ["setId"],
            childColumns = ["setId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["setId"])]
)
data class QuestionEntity (
    @PrimaryKey(autoGenerate = true)
    val questionId: Int = 0,

    val setId: Int,
    val text: String? = null,
    val type: QuestionType? = null,
    val correctText: String? = null,
)