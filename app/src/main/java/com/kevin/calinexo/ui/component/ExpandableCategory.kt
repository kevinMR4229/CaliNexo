package com.kevin.calinexo.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.ui.theme.LettersBlackBackground
import com.kevin.calinexo.ui.theme.SecondaryColor
import com.kevin.testapplication.R

data class ExpandableCategoryData(
    val text: String,
    val textColor: Color,
    val icon: Int,
    val iconColor: Color,
    val onClick: () -> Unit
)


@Composable
fun ExpandableCategory(data: ExpandableCategoryData, modifier: Modifier = Modifier) {

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = data.text,
            color = data.textColor,
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(
            modifier = Modifier.weight(1f)
        )


        Box(modifier = Modifier
            .size(28.dp)
            .background(
                color = Color.Gray,
                shape = CircleShape
            ),
            contentAlignment = Alignment.Center) {
            Icon(
                painter = painterResource(data.icon),
                contentDescription = "icono",
                tint = data.iconColor,
                modifier = Modifier.size(24.dp),
            )
        }

    }
}


@Preview
@Composable
fun ExpandableCategoryPreview() {
    ExpandableCategory(
        data = ExpandableCategoryData(
            text = "Principiante",
            textColor = LettersBlackBackground,
            icon = R.drawable.outline_arrow_forward_ios_24,
            iconColor = Color.White,
            onClick = {}
        ),
        modifier = Modifier.background(
            color = SecondaryColor,
            shape = RoundedCornerShape(20)
        )
    )
}