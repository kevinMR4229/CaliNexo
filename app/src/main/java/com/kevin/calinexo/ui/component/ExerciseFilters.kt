package com.kevin.calinexo.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.ui.theme.LettersBlackBackground
import com.kevin.calinexo.ui.theme.PrimaryColor
import com.kevin.calinexo.ui.theme.SecondaryColor

data class FilterOption(
    val name: String,
    val onClick: () -> Unit
)

data class ExerciseFiltersData(
    val filters: List<FilterOption>,
    val selected: FilterOption,
    val backgroundColor: Color
)


@Composable
fun ExerciseFilters(data: ExerciseFiltersData, modifier: Modifier = Modifier) {

    Row(
        modifier = modifier
            .background(
                color = data.backgroundColor,
                shape = RoundedCornerShape(50.dp)
            )
    ) {
        Spacer(
            modifier = Modifier.width(4.dp)
        )

        for (filter in data.filters) {

            if (filter == data.selected) {
                InfoChip(
                    InfoChipData(
                        text = filter.name,
                        textColor = LettersBlackBackground,
                        boxColor = PrimaryColor,
                        roundedCorner = 50
                    ),
                    modifier = Modifier.width(100.dp)
                )
            } else {
                InfoChip(
                    InfoChipData(
                        text = filter.name,
                        textColor = LettersBlackBackground,
                        boxColor = SecondaryColor,
                        roundedCorner = 50
                    ),
                    modifier = Modifier.width(100.dp)
                )
            }



            Spacer(
                modifier = Modifier.width(4.dp)
            )
        }
    }
}


@Preview
@Composable
fun ExerciseFiltersPreview() {
    val list: List<FilterOption> = listOf(
        FilterOption(
            name = "Nivel",
            onClick = {}
        ),
        FilterOption(
            name = "Zona",
            onClick = {}
        )
    )

    ExerciseFilters(
        ExerciseFiltersData(
            filters = list,
            selected = list.get(0),
            backgroundColor = SecondaryColor
        ),
        modifier = Modifier
    )

}