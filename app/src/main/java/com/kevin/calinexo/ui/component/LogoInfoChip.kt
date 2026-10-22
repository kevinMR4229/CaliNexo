package com.kevin.calinexo.ui.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class LogoInfoChipData(
    val text: String,
    val textColor: Color,
    val boxColor: Color,
    val icon: Int,
    val iconColor: Color
)

@Composable
fun LogoInfoChip(data: LogoInfoChipData, modifier: Modifier = Modifier) {

    Surface(  //creo el contenedor del texto
        modifier = modifier
            //.align(Alignment.BottomStart)
            .padding(8.dp),
        color = Color.Gray,
        shape = RoundedCornerShape(20)
    ) {

        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(data.icon),
                contentDescription = "icono",
                tint = data.iconColor,

                )

            Spacer(
                modifier = Modifier.width(1.dp)
            )

            Text(
                text = data.text,
                color = data.textColor,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(
                    horizontal = 10.dp,
                    vertical = 4.dp
                )
            )
        }
    }
}