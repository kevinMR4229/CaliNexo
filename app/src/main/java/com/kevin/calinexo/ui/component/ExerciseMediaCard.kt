package com.kevin.calinexo.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.testapplication.R

data class ExerciseMediaCardData(
    val image: Int,
    val level: String,
    val chipColor: Color
)

@Composable
fun ExerciseMediaCard(
    data: ExerciseMediaCardData,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(20.dp))
    ) {

        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(data.image),
            contentDescription = "Imagen del ejercicio",
            contentScale = ContentScale.Crop
        )

        InfoChip(
            data = InfoChipData(
                text = "Nivel ${data.level}",
                textColor = MaterialTheme.colorScheme.onPrimaryContainer,
                boxColor = data.chipColor,
                roundedCorner = 50
            ),
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(5.dp)
        )
    }
}

@Preview
@Composable
fun ExerciseMediaCardPreview() {
    ExerciseMediaCard(
        data = ExerciseMediaCardData(
            image = R.drawable.imagen_dominadas_prueba,
            level = "Intermedio",
            chipColor = Color.Red
        )
    )
}