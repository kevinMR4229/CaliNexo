package com.kevin.calinexo.model

import com.kevin.calinexo.ui.component.Muscle

data class Exercise (
    val id: String,
    val name: String,
    val difficulty: DifficultyLevel,
    val muscles: List<Muscle>
)