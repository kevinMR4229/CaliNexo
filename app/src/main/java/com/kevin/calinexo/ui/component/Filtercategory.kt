package com.kevin.calinexo.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.model.DifficultyLevel
import com.kevin.calinexo.ui.theme.LettersBlackBackground
import com.kevin.calinexo.ui.theme.PrimaryColor
import com.kevin.calinexo.ui.theme.SecondaryColor

data class FilterCategoryData(
    val level: DifficultyLevel,
    val selected: Boolean
)


@Composable
fun FilterCategory(data: FilterCategoryData, onClick: () -> Unit, modifier: Modifier = Modifier) {

    InfoChip(
        data = InfoChipData(
            text = data.level.displayName,
            textColor = LettersBlackBackground,
            boxColor = if (data.selected) {
                PrimaryColor
            } else {
                SecondaryColor
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