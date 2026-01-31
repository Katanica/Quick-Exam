package com.example.quickexam.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class QuizSetEntity(
    @PrimaryKey(autoGenerate = true)
    val setId: Int = 0,
    val title: String,
    val description: String
)