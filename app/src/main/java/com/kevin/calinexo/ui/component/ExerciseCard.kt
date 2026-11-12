package com.kevin.calinexo.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.model.DifficultyLevel
import com.kevin.calinexo.ui.theme.SecondaryColor
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import com.kevin.calinexo.ui.theme.LettersBlackBackground
import com.kevin.testapplication.R

data class ExerciseCardData(
    val name: String,
    val difficultyLevel: DifficultyLevel,
    val image: Int
)


@Composable
fun ExerciseCard(data: ExerciseCardData, modifier: Modifier = Modifier) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = SecondaryColor,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(65.dp)
                .clip(CircleShape),
            contentAlignment = Alignment.Center
        ) {

            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(data.image),
                contentDescription = "Imagen",
                contentScale = ContentScale.Crop
            )
        }


        Spacer(
            modifier = Modifier
                .width(10.dp)
        )


        Column(
            modifier = Modifier
                .padding(vertical = 5.dp)
        ) {
            Text(
                text = data.name,
                color = LettersBlackBackground,
                style = MaterialTheme.typography.labelLarge
            )

            Text(
                text = data.difficultyLevel.displayName,
                color = data.difficultyLevel.getColor(),
                style = MaterialTheme.typography.labelSmall
            )
        }
    }
}


@Preview
@Composable
fun ExerciseCardPreview() {
    ExerciseCard(
        data = ExerciseCardData(
            name = "Dominadas",
            difficultyLevel = DifficultyLevel.INTERMEDIATE,
            image = R.drawable.imagen_dominadas_prueba
        )
    )
}