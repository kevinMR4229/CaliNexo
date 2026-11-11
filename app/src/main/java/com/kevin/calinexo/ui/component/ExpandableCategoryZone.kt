package com.kevin.calinexo.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.ui.theme.SecondaryColor
import com.kevin.testapplication.R

@Composable
fun ExpandableCategoryZone(list: List<String>, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {

        for (text in list) {
            ExpandableCategory(
                data = ExpandableCategoryData(
                    text = text,
                    icon = R.drawable.outline_arrow_forward_ios_24,
                    iconColor = Color.White,
                    onClick = {}
                ),
                modifier = Modifier.background(
                    color = SecondaryColor,
                    shape = RoundedCornerShape(20))
                    .padding(15.dp)
            )

            Spacer(modifier = Modifier.padding(vertical = 5.dp))
        }
    }
}