package com.example.quickexam.data.local

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

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
data class AttemptEntity(
    @PrimaryKey(autoGenerate = true)
    val attemptId: Int,

    val setId: Int,

    // milisekunde
    val startedAt: Long,
    val finishedAt: Long,

    val score: Int
)