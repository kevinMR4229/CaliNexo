package com.kevin.calinexo.ui.component

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource


data class pageTittleData(
    val pageTittle: String,
    val arrowBack: Int,
    val heart: Int,
    val onIconoIzq: () -> Unit,
    val onIconoDer: () -> Unit
)

@Composable
fun pageTittle(data: pageTittleData, modifier: Modifier = Modifier){

    Row(modifier = modifier
        .fillMaxWidth()) {

        //Flecha atras
        IconButton(onClick = data.onIconoIzq,
            modifier = modifier) {
            Icon(painterResource(data.arrowBack))
        }

        //Espacio


        //Nombre


        //Espacio


        //Me gusta
    }
}