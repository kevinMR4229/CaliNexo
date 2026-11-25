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
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.model.DifficultyLevel
import com.kevin.calinexo.ui.theme.CalinexoTheme
import com.kevin.testapplication.R

data class ExerciseCardData(
    val id: String,
    val tittle: String,
    val subTittle: DifficultyLevel,
    val image: Int,
    val subtittleColor: Color
)

@Composable
fun ExerciseCard(
    onCardClick: (String) -> Unit = {},
    data: ExerciseCardData,
    modifier: Modifier = Modifier
) {

    Card(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colorScheme.surfaceContainerLow,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(10.dp),
        onClick = {onCardClick(data.id)}
    ) {
        Row(

            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .size(65.dp)
                    .clip(CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(data.image),
                    contentDescription = data.tittle,
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.width(10.dp))

            Column(
                modifier = Modifier.padding(vertical = 5.dp)
            ) {

                Text(
                    text = data.tittle,
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.labelLarge
                )

                Text(
                    text = data.subTittle.displayName,
                    color = data.subtittleColor,
                    style = MaterialTheme.typography.labelSmall
                )
            }
        }
    }

}

@Preview
@Composable
fun ExerciseCardPreview() {
    CalinexoTheme() {
        ExerciseCard(
            data = ExerciseCardData(
                id = "Push_up",
                tittle = "Dominadas",
                subTittle = DifficultyLevel.INTERMEDIATE,
                image = R.drawable.imagen_dominadas_prueba,
                subtittleColor = Color.Yellow
            )
        )
    }

}