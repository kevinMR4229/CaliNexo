package com.kevin.calinexo.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.kevin.testapplication.R
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.ui.theme.CalinexoTheme


data class HeaderData(
    val logo: Int,
    val nombre: String
)

@Composable
fun header(
    data: HeaderData,
    modifier: Modifier = Modifier
) {

    Column {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colorScheme.surface
                )
                .height(64.dp)
                .padding(horizontal = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(data.logo),
                contentDescription = "Logo de la app",
                modifier = Modifier.size(52.dp)
            )

            Spacer(
                modifier = Modifier.width(8.dp)
            )

            Text(
                text = data.nombre,
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.5.sp
            )

            Spacer(
                modifier = Modifier.weight(1f)
            )

            Icon(
                painter = painterResource(R.drawable.account_icon),
                contentDescription = "Perfil",
                tint = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.size(28.dp)
            )
        }

        HorizontalDivider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.outlineVariant
                .copy(alpha = 0.35f)
        )
    }
}

@Preview
@Composable
fun headerPreview() {
    CalinexoTheme() {
        header(
            data = HeaderData(
                logo = R.drawable.logo_mejorado,
                nombre = "CaliNexo"
            ),
            modifier = Modifier
        )
    }

}