package com.kevin.calinexo.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.model.DifficultyLevel

data class FiltersData(
    val levels: List<DifficultyLevel>,
    val selectedLevel: DifficultyLevel,
    val onLevelSelected: (DifficultyLevel) -> Unit
)

@Composable
fun Filters(
    data: FiltersData,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier.background(
            color = MaterialTheme.colorScheme.surfaceContainer,
            shape = RoundedCornerShape(50.dp)
        )
    ) {

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

@Preview
@Composable
fun FiltersPreview() {

    Filters(
        data = FiltersData(
            levels = DifficultyLevel.entries,
            selectedLevel = DifficultyLevel.BEGINNER,
            onLevelSelected = {}
        )
    )
}