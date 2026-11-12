package com.kevin.calinexo.model

import androidx.compose.ui.graphics.Color
import com.kevin.calinexo.ui.theme.HighPriority
import com.kevin.calinexo.ui.theme.LowPriority
import com.kevin.calinexo.ui.theme.MediumPriority

enum class DifficultyLevel(val displayName: String) {
    BEGINNER("Principiante"),
    INTERMEDIATE("Intermedio"),
    ADVANCED("Avanzado"),
    PRO("Pro");

    fun getColor(): Color {
        return when (this) {
            DifficultyLevel.BEGINNER -> LowPriority
            DifficultyLevel.INTERMEDIATE -> MediumPriority
            DifficultyLevel.ADVANCED -> HighPriority
            DifficultyLevel.PRO -> HighPriority
        }
    }
}