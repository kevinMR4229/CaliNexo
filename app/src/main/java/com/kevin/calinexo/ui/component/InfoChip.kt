package com.kevin.calinexo.ui.component

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class InfoChipData(
    val text: String,
    val textColor: Color,
    val boxColor: Color,
    val icon: Int? = null,
    val iconColor: Color?,
    val cornerRound: Int
)

@Composable
fun InfoChip(data: InfoChipData, modifier: Modifier = Modifier) {

    Surface(  //creo el cintenedor del texto
        modifier = modifier,
        color = data.boxColor,
        shape = RoundedCornerShape(data.cornerRound)
    ) {
        if (data.icon != null)
        Icon(
            painter = painterResource(data.icon),
            contentDescription = "icono",
            tint = data.iconColor)

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


@Preview
@Composable
fun infoChipPreview(){

}