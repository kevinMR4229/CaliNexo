package com.kevin.calinexo.ui

import com.kevin.calinexo.ui.component.Instruction

object Seeder {

    fun sendInstructionStepCards(): List<Instruction> {

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
}