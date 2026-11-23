package com.kevin.calinexo.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.testapplication.R

data class BottomNavItemData(
    val icon: Int,
    val text: String,
    val selected: Boolean,
    val onClick: () -> Unit
)

@Composable
fun BottomNavItem(
    data: BottomNavItemData,
    modifier: Modifier = Modifier
) {

    val contentColor =
        if (data.selected) {
            MaterialTheme.colorScheme.primary
        } else {
            MaterialTheme.colorScheme.onSurfaceVariant
        }

    Column(
        modifier = modifier.padding(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            painter = painterResource(data.icon),
            contentDescription = data.text,
            tint = contentColor,
            modifier = Modifier.size(24.dp)
        )

        Text(
            text = data.text,
            color = contentColor,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Preview
@Composable
fun BottomNavItemPreview() {
    BottomNavItem(
        data = BottomNavItemData(
            icon = R.drawable.home,
            text = "Inicio",
            selected = true,
            onClick = {}
        )
    )
}