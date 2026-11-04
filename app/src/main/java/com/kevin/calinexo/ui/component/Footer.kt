package com.kevin.calinexo.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.ui.theme.BackgroundColor
import com.kevin.testapplication.R


@Composable
fun Footer(modifier: Modifier = Modifier) {

    Column() {
        HorizontalDivider(
            thickness = 1.dp,
            color = Color.White.copy(alpha = 0.05f)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = BackgroundColor)
                .height(64.dp)
                .padding(horizontal = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            BottomNavItem(
                data = BottomNavItemData(
                icon = R.drawable.home,
                iconColor = Color.White,
                text = "Inicio",
                selected = true,
                onClick = {}
            ))

            Spacer(
                modifier = Modifier.weight(1f)
            )

            BottomNavItem(
                data = BottomNavItemData(
                icon = R.drawable.trending_up,
                iconColor = Color.White,
                text = "Progreso",
                selected = true,
                onClick = {}
            ))

            Spacer(
                modifier = Modifier.weight(1f)
            )

            BottomNavItem(
                data = BottomNavItemData(
                icon = R.drawable.exercise,
                iconColor = Color.White,
                text = "Ejercicios",
                selected = true,
                onClick = {}
            ))

            Spacer(
                modifier = Modifier.weight(1f)
            )

            BottomNavItem(
                data = BottomNavItemData(
                icon = R.drawable.location_on,
                iconColor = Color.White,
                text = "Parques",
                selected = true,
                onClick = {}
            ))
        }
    }


}

@Preview
@Composable
fun FooterPreview() {
    Footer()
}