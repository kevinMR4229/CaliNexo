package com.kevin.calinexo.model

data class Exercise (
    val id: String,
    val image: Int,
    val name: String,
    val difficulty: DifficultyLevel,
    val muscles: List<Muscle>,
    val instructions: List<Instruction>
)