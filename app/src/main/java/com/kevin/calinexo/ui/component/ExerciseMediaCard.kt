package com.kevin.calinexo.ui.component

import android.R.attr.text
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
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
import com.kevin.calinexo.ui.theme.LettersBlackBackground
import com.kevin.calinexo.ui.theme.LogoInfoChipBackground
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
            modifier = Modifier
                .fillMaxWidth(),
            painter = painterResource(data.image),
            contentDescription = "Imagen",
            contentScale = ContentScale.Crop
        )



        //Nivel
        InfoChip(data = InfoChipData(
            text = data.level,
            textColor = Color.Black,
            boxColor = Color.Red,
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
        LogoInfoChip(
            LogoInfoChipData(
                text = data.time.toString() + " seg por serie",
                textColor = LettersBlackBackground,
                boxColor = LogoInfoChipBackground,
                icon = R.drawable.clock,
                iconColor = LogoInfoChipBackground
            ),
            modifier = Modifier
                .align(Alignment.BottomStart)
        )



        //Fuerza
        LogoInfoChip(
            LogoInfoChipData(
                text = data.strengh,
                textColor = LettersBlackBackground,
                boxColor = LogoInfoChipBackground,
                icon = R.drawable.lightning,
                iconColor = LogoInfoChipBackground
            ),
            modifier = Modifier
                .align(Alignment.BottomEnd)
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