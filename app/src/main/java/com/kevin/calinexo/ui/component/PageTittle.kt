package com.kevin.calinexo.ui.component

import com.kevin.testapplication.R
import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


data class PageTittleData(
    val pageTittle: String,
    val arrowBack: Int,
    val heart: Int,
    val onIconoIzq: () -> Unit,
    val onIconoDer: () -> Unit
)

@Composable
fun pageTittle(data: PageTittleData, modifier: Modifier = Modifier){

    Row(modifier = modifier
        .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically) {

        //Flecha atras
        IconButton(
            onClick = data.onIconoIzq,
            modifier = Modifier) {
            Icon(
                painter = painterResource(data.arrowBack),
                contentDescription = "flecha atras",
                tint = Color.White
            )
        }

        //Espacio
        Spacer(modifier = Modifier.weight(1f))

        //Nombre
        Text(
            text = data.pageTittle,
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.5.sp
        )

        //Espacio
        Spacer(modifier = Modifier.weight(1f))

        //Me gusta
        IconButton(
            onClick = data.onIconoDer,
            modifier = Modifier) {
            Icon(
                painter = painterResource(data.heart),
                contentDescription = "Corazón",
                tint = Color.White
            )
        }
    }
}


@Preview
@Composable
fun pageTittlePreview(){

    pageTittle(
        data = PageTittleData(
            pageTittle = "dominadas",
            arrowBack = R.drawable.arrow_back,
            heart = R.drawable.ic_favorite_border,
            onIconoIzq = {},
            onIconoDer = {}
        ),
        modifier = Modifier
    )
}