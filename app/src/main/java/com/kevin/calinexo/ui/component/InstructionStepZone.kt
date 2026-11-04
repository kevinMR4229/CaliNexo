package com.kevin.calinexo.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.ui.theme.LettersBlackBackground
import com.kevin.calinexo.ui.theme.PrimaryColor
import com.kevin.calinexo.ui.theme.SecondaryColor
import com.kevin.calinexo.ui.theme.TertiaryColor


data class Instruction(
    val title: String,
    val text: String
)

data class InstructionStepZoneData(
    val list: List<Instruction>
)


@Composable
fun InstructionStepZone(data: InstructionStepZoneData, modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
    ) {
        for ((index, instruction) in data.list.withIndex()) {
            InstructionStepCard(
                data = InstructionStepCardData(
                    stepNumber = index + 1,
                    numberColor = PrimaryColor,
                    numberBackgroundColor = TertiaryColor,
                    title = instruction.title,
                    titleColor = LettersBlackBackground,
                    description = instruction.text,
                    descriptionColor = LettersBlackBackground,
                    cardColor = SecondaryColor
                )
            )

            Spacer(modifier = Modifier.padding(vertical = 5.dp))
        }
    }
}

@Preview
@Composable
fun InstructionStepZonePreview() {
    val list = listOf<Instruction>(
        Instruction(title = "Nombre", text = "sd"),
        Instruction(title = "Nombre", text = "sd")
    )

    InstructionStepZone(
        data = InstructionStepZoneData(
            list = list
        )
    )
}