package com.kevin.calinexo.repo

import com.kevin.calinexo.model.DifficultyLevel
import com.kevin.calinexo.model.Effort
import com.kevin.calinexo.model.Exercise
import com.kevin.calinexo.model.Instruction
import com.kevin.calinexo.model.Muscle
import com.kevin.calinexo.ui.component.FilterOption

object Seeder {

    val exercises: List<Exercise> = listOf(
        Exercise(
            id = "pull_up",
            name = "Dominadas",
            difficulty = DifficultyLevel.INTERMEDIATE,

            muscles = listOf(
                Muscle(
                    name = "Bíceps",
                    effort = Effort.HIGH
                ),
                Muscle(
                    name = "Core",
                    effort = Effort.MEDIUM
                )
            ),

            instructions = listOf(
                Instruction(
                    title = "Agarre y posición",
                    text = "Sujétate de la barra con las palmas hacia arriba"
                ),
                Instruction(
                    title = "Tracción completa",
                    text = "Tira hacia arriba usando solo los brazos hasta que la barbilla sobrepase la barra"
                )
            )
        )
    )



    fun getExerciseById(id: String): Exercise {
        val exercise = exercises.find { it.id == id }

        if (exercise == null){throw IllegalArgumentException("Ejercicio no encontrado")
        }

        return exercise
    }

    fun getAllExercises(): List<Exercise> {
        return exercises.stream().toList()
    }








    //ExerciseDetailScreen



    //ExerciseScreen
    fun sendExerciseFilters(): List<FilterOption> {

        return listOf(
            FilterOption(
                name = "Nivel",
                onClick = {}
            ),
            FilterOption(
                name = "Zona",
                onClick = {}
            )
        )
    }

    fun sendExpandableCategoryLevels(): List<String> {
        return listOf(
            "Principiante",
            "Intermedio",
            "Avanzado",
            "Pro"
        )
    }
}