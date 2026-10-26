package com.kevin.calinexo.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.ui.theme.ClockColor
import com.kevin.calinexo.ui.theme.LettersBlackBackground
import com.kevin.calinexo.ui.theme.PrimaryColor
import com.kevin.calinexo.ui.theme.TertiaryColor
import com.kevin.testapplication.R


data class ExerciseMediaCarddata(
    val image: Int,
    val level: String,
    val time: Int,
    val strengh: String
    //val S
)

@Composable
fun ExerciseMediaCard(data: ExerciseMediaCarddata, modifier: Modifier = Modifier){

    Box(modifier = modifier
        .fillMaxWidth()
        .height(200.dp)
    ){


        //Imagen
        Image(
            modifier = Modifier
                .fillMaxWidth(),
            painter = painterResource(data.image),
            contentDescription = "Imagen",
            contentScale = ContentScale.Crop
        )



        //Nivel
        InfoChip(data = InfoChipData(
            text = "Nivel " + data.level,
            textColor = Color.Black,
            boxColor = PrimaryColor,
            roundedCorner = 50
            //icon
        ),
            modifier = modifier
                .align(Alignment.TopStart)
                .padding(
                    horizontal = 5.dp,
                    vertical = 5.dp
                )
        )



        //Tiempo
        InfoChip(
            InfoChipData(
                text = data.time.toString() + " seg por serie",
                textColor = LettersBlackBackground,
                boxColor = TertiaryColor,
                icon = R.drawable.clock,
                iconColor = ClockColor,
                roundedCorner = 20
            ),
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(8.dp)
        )



        //Fuerza
        InfoChip(
            InfoChipData(
                text = data.strengh,
                textColor = LettersBlackBackground,
                boxColor = TertiaryColor,
                icon = R.drawable.lightning,
                iconColor = Color.White,
                roundedCorner = 20
            ),
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(8.dp)
        )
    }
}

@Preview
@Composable
fun ExerciseMediaCardPreview(){
    ExerciseMediaCard(
        data = ExerciseMediaCarddata(
            image = R.drawable.imagen_dominadas_prueba,
            level = "Intermedio",
            time = 34,
            strengh = "Fuerza base"
        ),
        modifier = Modifier
    )
}