package com.kevin.calinexo.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.model.DifficultyLevel

data class FilterCategoryData(
    val level: DifficultyLevel,
    val selected: Boolean
)

@Composable
fun FilterCategory(
    data: FilterCategoryData,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {

    InfoChip(
        data = InfoChipData(
            text = data.level.displayName,
            textColor =
                if (data.selected) {
                    MaterialTheme.colorScheme.onPrimary
                } else {
                    MaterialTheme.colorScheme.onSurface
                },
            boxColor =
                if (data.selected) {
                    MaterialTheme.colorScheme.primary
                } else {
                    MaterialTheme.colorScheme.surfaceContainer
                },
            roundedCorner = 50
        ),
        modifier = modifier
            .width(100.dp)
            .clickable {
                onClick()
            }
    )
}