package com.kevin.calinexo.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class InfoChipData(
    val text: String,
    val textColor: Color,
    val boxColor: Color,
    val icon: Int? = null,
    val iconColor: Color = Color.White,
    val roundedCorner: Int
)

@Composable
fun InfoChip(
    data: InfoChipData,
    modifier: Modifier = Modifier
) {

    Surface(
        modifier = modifier,
        color = data.boxColor,
        shape = RoundedCornerShape(data.roundedCorner.dp)
    ) {

        Row(
            modifier = Modifier.padding(5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            if (data.icon != null) {

                Icon(
                    painter = painterResource(data.icon),
                    contentDescription = "Icono",
                    tint = data.iconColor,
                    modifier = Modifier.size(15.dp)
                )

                Spacer(modifier = Modifier.width(10.dp))
            }

            Text(
                text = data.text,
                color = data.textColor,
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}

@Preview
@Composable
fun InfoChipPreview() {
    InfoChip(
        data = InfoChipData(
            text = "Bíceps",
            textColor = MaterialTheme.colorScheme.onSurface,
            boxColor = MaterialTheme.colorScheme.surfaceContainer,
            roundedCorner = 20
        )
    )
}