package com.kevin.calinexo.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.ui.theme.SecondaryColor

@Composable
fun ExpandableCategoryZone(list: List<ExpandableCategoryData>, modifier: Modifier = Modifier) {
    Row(modifier = modifier) {

        for (categoryData in list) {
            ExpandableCategory(
                data = ExpandableCategoryData(
                    text = categoryData.text,
                    icon = categoryData.icon,
                    iconColor = categoryData.iconColor,
                    onClick = categoryData.onClick
                ),
                modifier = Modifier
                    .background(
                        color = SecondaryColor,
                        shape = RoundedCornerShape(20)
                    )
                    .padding(15.dp)
            )

            Spacer(modifier = Modifier.padding(vertical = 5.dp))
        }
    }
}