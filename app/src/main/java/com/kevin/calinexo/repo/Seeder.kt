package com.kevin.calinexo.repo

import com.kevin.calinexo.model.DifficultyLevel
import com.kevin.calinexo.model.Effort
import com.kevin.calinexo.model.Exercise
import com.kevin.calinexo.model.Instruction
import com.kevin.calinexo.model.Muscle
import com.kevin.testapplication.R

object Seeder {

    private val exercises: List<Exercise> = listOf(
        //Dominadas
        Exercise(
            id = "pull_up",
            image = R.drawable.imagen_dominadas_prueba,
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
        ),

        //Flexiones
        Exercise(
            id = "push_up",
            image = R.drawable.imagen_flexiones,
            name = "Flexiones",
            difficulty = DifficultyLevel.BEGINNER,

            muscles = listOf(
                Muscle(
                    name = "Pecho",
                    effort = Effort.HIGH
                ),
                Muscle(
                    name = "Espalda",
                    effort = Effort.LOW
                ),
                Muscle(
                    name = "Bíceps",
                    effort = Effort.LOW
                )
            ),

            instructions = listOf(
                Instruction(
                    title = "Colocacion",
                    text = "Colocate boca abajo apollado sobre la palma de las manos y la punta de los pies. Los brazos abiertos a la anchura de los hombros"
                ),
                Instruction(
                    title = "Bajada",
                    text = "Flexiona los codos y baja de manera controlada con el tronco recto"
                ),
                Instruction(
                    title = "Subida",
                    text = "Sube de manera controlada con el tronco recto"
                )
            )
        )
    )


    fun getExerciseById(id: String): Exercise {
        val exercise = exercises.find { it.id == id }

        if (exercise == null) {
            throw IllegalArgumentException("Ejercicio no encontrado")
        }

        return exercise
    }

    fun getAllExercises(): List<Exercise> {
        return exercises.stream().toList()
    }


}