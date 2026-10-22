package com.kevin.calinexo.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kevin.testapplication.R

data class ExerciseMediaCarddata(
    val image: Int,
    val level: String,
    val time: Int,
    val strengh: String
)

@Composable
fun ExerciseMediaCard(data: ExerciseMediaCarddata, modifier: Modifier = Modifier){

    Box(modifier = modifier
        .fillMaxWidth()
        .height(200.dp)
    ){
        //Imagen
        Image(
            painter = painterResource(data.image),
            contentDescription = "Imagen",
            contentScale = ContentScale.Crop
        )

        //Nivel
        InfoChip(data = InfoChipData(
            text = data.level,
            textColor = Color.Black,
            boxColor = Color.Red,
            icon
        ),
            modifier = modifier
                .align(Alignment.TopStart)
                .padding(
                    horizontal = 5.dp,
                    vertical = 5.dp
                )
        )

        //Tiempo


        //Fuerza
    }
}

@Preview
@Composable
fun exerciseMediaCardPreview(){
    ExerciseMediaCard(
        data = ExerciseMediaCarddata(
            image = R.drawable.imagen_dominadas_prueba,
            level = "Intermedio",
            time = 34,
            strengh = "Fuerza base"
        )
    )
}