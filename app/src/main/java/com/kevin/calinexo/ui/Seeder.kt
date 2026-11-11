package com.kevin.calinexo.ui

import androidx.compose.ui.graphics.Color
import com.kevin.calinexo.ui.component.Effort
import com.kevin.calinexo.ui.component.ExpandableCategoryData
import com.kevin.calinexo.ui.component.FilterOption
import com.kevin.calinexo.ui.component.Instruction
import com.kevin.calinexo.ui.component.Muscle
import com.kevin.testapplication.R

object Seeder {

    //ExerciseDetailScreen
    fun sendInstructionStepData(): List<Instruction> {

        return listOf(
            Instruction(
                title = "Agarre y Posición",
                text = "Sujétate de la barra con las palmas hacia arriba"
            ),

            Instruction(
                title = "Tracción Completa",
                text = "Tira hacia arriba usando solo los brazos hasta que la barbilla sobrepase la barra"
            ),
            //Instruction(
            //    title = "Bajada Controlada",
            //    text = "Baja de manera controlada hasta que los brazos queden completamente estirados"
            //)
        )
    }

    fun sendMuscles(): List<Muscle>{
        return listOf(
            Muscle(
                "Biceps",
                Effort.HIGH
            ),
            Muscle(
                "Core",
                Effort.MEDIUM
            ),
            Muscle(
                "Piernas",
                Effort.LOW
            )
        )
    }








    //ExerciseScreen
    fun sendExerciseFilters(): List<FilterOption>{

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

    fun sendExpandableCategoryData(): List<ExpandableCategoryData>{
        return listOf(
            ExpandableCategoryData(
                text = "Principiante",
                icon = R.drawable.outline_arrow_forward_ios_24,
                iconColor = Color.White,
                onClick = {}
            ),
            ExpandableCategoryData(
                text = "Intermedio",
                icon = R.drawable.outline_arrow_forward_ios_24,
                iconColor = Color.White,
                onClick = {}
            ),
            ExpandableCategoryData(
                text = "Avanzado",
                icon = R.drawable.outline_arrow_forward_ios_24,
                iconColor = Color.White,
                onClick = {}
            ),
            ExpandableCategoryData(
                text = "Pro",
                icon = R.drawable.outline_arrow_forward_ios_24,
                iconColor = Color.White,
                onClick = {}
            )
        )
    }
}