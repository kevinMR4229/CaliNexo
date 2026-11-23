package com.kevin.calinexo.ui.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.kevin.testapplication.R

data class PageTitleData(
    val pageTittle: String,
    val arrowBack: Int,
    val heart: Int,
    val onIconoIzq: () -> Unit,
    val onIconoDer: () -> Unit
)

@Composable
fun pageTitle(
    data: PageTitleData,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        IconButton(
            onClick = data.onIconoIzq
        ) {

            Icon(
                painter = painterResource(data.arrowBack),
                contentDescription = "Flecha atrás",
                tint = MaterialTheme.colorScheme.onSurface
            )
        }

        Spacer(
            modifier = Modifier.weight(1f)
        )

        Text(
            text = data.pageTittle,
            color = MaterialTheme.colorScheme.onSurface,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.5.sp
        )

        Spacer(
            modifier = Modifier.weight(1f)
        )

        IconButton(
            onClick = data.onIconoDer
        ) {

            Icon(
                painter = painterResource(data.heart),
                contentDescription = "Corazón",
                tint = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Preview
@Composable
fun PageTitlePreview() {

    pageTitle(
        data = PageTitleData(
            pageTittle = "Dominadas",
            arrowBack = R.drawable.arrow_back,
            heart = R.drawable.ic_favorite_border,
            onIconoIzq = {},
            onIconoDer = {}
        )
    )
}