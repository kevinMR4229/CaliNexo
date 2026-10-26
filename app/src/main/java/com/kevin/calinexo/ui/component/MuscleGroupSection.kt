package com.kevin.calinexo.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.ui.theme.LettersBlackBackground
import com.kevin.calinexo.ui.theme.SecondaryColor
import com.kevin.testapplication.R

data class MuscleGroupSectionData(
    val title: String,
    val muscles: List<String>
)


@Composable
fun MuscleGroupSection(data: MuscleGroupSectionData, modifier: Modifier = Modifier) {
    Column() {
        Text(
            text = data.title,
            color = LettersBlackBackground,
            style = MaterialTheme.typography.bodyMedium
        )


        Row() {
            for (muscle in data.muscles) {
                InfoChip(
                    InfoChipData(
                        text = muscle,
                        textColor = LettersBlackBackground,
                        boxColor = SecondaryColor,
                        icon = R.drawable.circlepx,
                        roundedCorner = 20

                    ),
                    modifier = Modifier
                )

                Spacer(
                    modifier = Modifier.width(4.dp)
                )

            }
        }


    }
}


@Preview
@Composable
fun MuscleGroupSectionPreview(){
    MuscleGroupSection(data = MuscleGroupSectionData(
        title = "Musculos Principales",
        muscles = listOf("Espalda", "Biceps", "Core")
    ),
        modifier = Modifier)
}