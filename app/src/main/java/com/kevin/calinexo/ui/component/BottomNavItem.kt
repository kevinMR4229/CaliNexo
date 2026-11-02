package com.kevin.calinexo.ui.component

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import com.kevin.calinexo.ui.theme.LettersBlackBackground
import com.kevin.testapplication.R


data class BottomNavItemData(
    val icon: Int,
    val iconColor: Color,
    val text: String,
    val selected: Boolean,
    val onClick: () -> Unit
)


@Composable
fun BottomNavItem(data: BottomNavItemData, modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .padding(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Icon(
            painter = painterResource(data.icon),
            contentDescription = "icono",
            tint = data.iconColor,
            modifier = Modifier.size(24.dp)
        )

        Text(
            text = data.text,
            color = LettersBlackBackground,
            style = MaterialTheme.typography.bodyMedium
        )

    }
}


@Preview
@Composable
fun BottomNavItemPreview(){

    BottomNavItem(data = BottomNavItemData(
        icon = R.drawable.home,
        iconColor = Color.White,
        text = "Inicio",
        selected = true,
        onClick = {}
    ))
}