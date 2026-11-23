package com.kevin.calinexo.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.model.Instruction

@Composable
fun InstructionStepZone(
    data: List<Instruction>,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
    ) {

        for ((index, instruction) in data.withIndex()) {

            InstructionStepCard(
                data = InstructionStepCardData(
                    stepNumber = index + 1,
                    title = instruction.title,
                    description = instruction.text
                )
            )

            Spacer(
                modifier = Modifier.height(10.dp)
            )
        }
    }
}

@Preview
@Composable
fun InstructionStepZonePreview() {

    InstructionStepZone(
        data = listOf(
            Instruction(
                title = "Agarre",
                text = "Coloca correctamente las manos."
            ),
            Instruction(
                title = "Tracción",
                text = "Sube de forma controlada."
            )
        )
    )
}