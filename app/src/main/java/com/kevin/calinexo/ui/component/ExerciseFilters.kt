package com.kevin.calinexo.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.model.DifficultyLevel
import com.kevin.calinexo.ui.theme.SecondaryColor


data class ExerciseFiltersData(
    val levels: List<DifficultyLevel>,
    val selectedLevel: DifficultyLevel,
    val onLevelSelected: (DifficultyLevel) -> Unit
)


@Composable
fun ExerciseFilters(data: ExerciseFiltersData, modifier: Modifier = Modifier) {

    Row(
        modifier = modifier
            .background(
                color = SecondaryColor,
                shape = RoundedCornerShape(50.dp)
            )
    ) {


        Row(modifier = modifier) {

            for (level in data.levels) {

                FilterCategory(
                    data = FilterCategoryData(
                        level = level,
                        selected = level == data.selectedLevel
                    ),
                    onClick = {
                        data.onLevelSelected(level)
                    }
                )


            }
        }
    }
}

@Preview
@Composable
fun ExerciseFiltersPreview() {
    val list: List<DifficultyLevel> = listOf(

        DifficultyLevel.BEGINNER,
        DifficultyLevel.INTERMEDIATE,
        DifficultyLevel.ADVANCED,
        DifficultyLevel.PRO

    )

    ExerciseFilters(
        ExerciseFiltersData(
            levels = list,
            selectedLevel = DifficultyLevel.BEGINNER,
            onLevelSelected = {}
        ),
        modifier = Modifier
    )
}