package com.kevin.calinexo.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.graphics.Color
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kevin.calinexo.ui.theme.LettersBlackBackground
import com.kevin.calinexo.ui.theme.SecondaryColor
import com.kevin.testapplication.R

data class InfoChipData(
    val text: String,
    val textColor: Color,
    val boxColor: Color,
    val icon: Int? = null,
    val iconColor: Color = Color.White,
    val roundedCorner: Int
)

@Composable
fun InfoChip(data: InfoChipData, modifier: Modifier = Modifier) {

    Surface(  //creo el contenedor del texto
        modifier = modifier,
        color = data.boxColor,
        shape = RoundedCornerShape(data.roundedCorner)
    ) {

        Row(
            modifier = Modifier
                .padding(all = 5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            if (data.icon != null){
                Icon(
                    painter = painterResource(data.icon),
                    contentDescription = "icono",
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
fun infoChipPreview(){
    InfoChip(data = InfoChipData(
        text = "Bicep",
        textColor = LettersBlackBackground,
        boxColor = SecondaryColor,
        icon = R.drawable.full_circle_24,
        iconColor = Color.Red,
        roundedCorner = 20
    ))
}