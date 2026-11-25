package com.kevin.calinexo.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.testapplication.R


@Composable
fun MyBottomBar(modifier: Modifier = Modifier) {

    Column {
        HorizontalDivider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.outlineVariant
                .copy(alpha = 0.35f)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colorScheme.surface
                )
                .height(64.dp)
                .padding(horizontal = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            BottomNavItem(
                data = BottomNavItemData(
                    icon = R.drawable.home,
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
                    text = "Parques",
                    selected = true,
                    onClick = {}
                ))
        }
    }


}

@Preview
@Composable
fun MyBottomBarPreview() {
    MyBottomBar()
}