package com.kevin.calinexo.ui.component

import androidx.compose.foundation.background
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
import com.kevin.calinexo.ui.theme.HighPriority
import com.kevin.calinexo.ui.theme.LettersBlackBackground
import com.kevin.calinexo.ui.theme.LowPriority
import com.kevin.calinexo.ui.theme.MediumPriority
import com.kevin.calinexo.ui.theme.SecondaryColor
import com.kevin.calinexo.ui.theme.TertiaryColor
import com.kevin.testapplication.R


enum class Effort(val color: Color) {
    LOW(LowPriority),
    MEDIUM(MediumPriority),
    HIGH(HighPriority);


}

data class Muscle(
    val name: String,
    val effort: Effort
)

data class MuscleGroupSectionData(
    val title: String,
    val muscles: List<Muscle>
)


@Composable
fun MuscleGroupSection(data: MuscleGroupSectionData, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = data.title,
            color = LettersBlackBackground,
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(
            modifier = Modifier.height(4.dp)
        )

        Row() {
            for (muscle in data.muscles) {
                InfoChip(
                    InfoChipData(
                        text = muscle.name,
                        textColor = LettersBlackBackground,
                        boxColor = SecondaryColor,
                        icon = R.drawable.full_circle_24,
                        iconColor = muscle.effort.color,
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
fun MuscleGroupSectionPreview() {


    MuscleGroupSection(
        data = MuscleGroupSectionData(
            title = "Musculos Principales",
            muscles = listOf(
                Muscle(
                    name = "Biceps",
                    effort = Effort.HIGH
                ), Muscle(
                    name = "Core",
                    effort = Effort.MEDIUM
                ),
                Muscle(
                    name = "Piernas",
                    effort = Effort.LOW
                )
            )
        ),
        modifier = Modifier.background(
            Color.Black
        )
    )
}