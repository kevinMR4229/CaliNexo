package com.kevin.calinexo.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kevin.calinexo.ui.theme.TertiaryColor
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme


data class InstructionStepCardData(
    val stepNumber: Int,
    val numberColor: Color,
    val numberBackgroundColor: Color,
    val title: String,
    val titleColor: Color,
    val description: String,
    val descriptionColor: Color,
    val cardColor: Color,
)


@Composable
fun InstructionStepCard(data: InstructionStepCardData, modifier: Modifier = Modifier) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = data.cardColor,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(12.dp),
        verticalAlignment = Alignment.Top
    ) {

        // Número del paso
        Box(
            modifier = Modifier
                .size(28.dp)
                .background(
                    color = data.numberBackgroundColor,
                    shape = CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = data.stepNumber.toString(),
                color = data.numberColor,
                style = MaterialTheme.typography.labelMedium
            )
        }

        // Separación número - texto
        Spacer(
            modifier = Modifier.width(12.dp)
        )

        // Texto
        Column(
            modifier = Modifier.weight(1f)
        ) {

            Text(
                text = data.title,
                color = data.titleColor,
                style = MaterialTheme.typography.headlineSmall
            )

            Spacer(
                modifier = Modifier.height(4.dp)
            )

            Text(
                text = data.description,
                color = data.descriptionColor,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}


@Preview
@Composable
fun InstructionStepCardPreview() {

    InstructionStepCard(
        data = InstructionStepCardData(
            stepNumber = 1,
            numberColor = Color.Red,
            numberBackgroundColor = Color.Gray,
            title = "Agarre y Posicion",
            titleColor = Color.White,
            description = "Sujetate de la barraiygihboigiftiuk bklj njhbviuy fgliuijkk iuh iboiilkj iujkjnl oñnjjnlknlknoljñk iuhojlni ihlijnñl",
            descriptionColor = Color.White,
            cardColor = TertiaryColor
        ),
        modifier = Modifier
    )
}