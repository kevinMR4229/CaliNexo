package com.kevin.calinexo.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.model.Effort
import com.kevin.calinexo.model.Muscle
import com.kevin.calinexo.ui.theme.AdvancedLevel
import com.kevin.calinexo.ui.theme.BeginnerLevel
import com.kevin.calinexo.ui.theme.IntermediateLevel
import com.kevin.testapplication.R

data class MuscleGroupSectionData(
    val title: String,
    val muscles: List<Muscle>
)

@Composable
fun MuscleGroupSection(
    data: MuscleGroupSectionData,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
    ) {

        Text(
            text = data.title,
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(
            modifier = Modifier.height(4.dp)
        )

        Row {

            for (muscle in data.muscles) {

                InfoChip(
                    data = InfoChipData(
                        text = muscle.name,
                        textColor = MaterialTheme.colorScheme.onSurface,
                        boxColor = MaterialTheme.colorScheme.surfaceContainer,
                        icon = R.drawable.full_circle_24,
                        iconColor = when (muscle.effort) {
                            Effort.LOW -> BeginnerLevel
                            Effort.MEDIUM -> IntermediateLevel
                            Effort.HIGH -> AdvancedLevel
                        },
                        roundedCorner = 20
                    )
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
            title = "Músculos Principales",
            muscles = listOf(
                Muscle(
                    name = "Bíceps",
                    effort = Effort.HIGH
                ),
                Muscle(
                    name = "Core",
                    effort = Effort.MEDIUM
                ),
                Muscle(
                    name = "Piernas",
                    effort = Effort.LOW
                )
            )
        )
    )
}