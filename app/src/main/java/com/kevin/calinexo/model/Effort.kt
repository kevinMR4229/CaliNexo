package com.kevin.calinexo.model

import androidx.compose.ui.graphics.Color
import com.kevin.calinexo.ui.theme.HighPriority
import com.kevin.calinexo.ui.theme.LowPriority
import com.kevin.calinexo.ui.theme.MediumPriority

enum class Effort() {
    LOW,
    MEDIUM,
    HIGH;

    fun getColor(): Color {
        return when (this) {
            Effort.LOW -> LowPriority
            Effort.MEDIUM -> MediumPriority
            Effort.HIGH -> HighPriority
        }
    }

}