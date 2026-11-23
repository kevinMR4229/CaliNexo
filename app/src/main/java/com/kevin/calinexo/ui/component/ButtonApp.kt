package com.kevin.calinexo.ui.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kevin.testapplication.R

data class ButtonData(
    val text: String,
    val initIcon: Int? = null,
    val endIcon: Int? = null
)

@Composable
fun ButtonApp(
    data: ButtonData,
    modifier: Modifier = Modifier
) {

    Button(
        onClick = {},
        modifier = modifier,
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary
        )
    ) {

        Spacer(modifier = Modifier.weight(1f))

        if (data.initIcon != null) {
            Icon(
                painter = painterResource(data.initIcon),
                contentDescription = "Icono",
                tint = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier.size(24.dp)
            )
        }

        Text(
            text = data.text,
            color = MaterialTheme.colorScheme.onPrimary,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                horizontal = 10.dp,
                vertical = 4.dp
            )
        )

        if (data.endIcon != null) {
            Icon(
                painter = painterResource(data.endIcon),
                contentDescription = "Icono",
                tint = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier.size(24.dp)
            )
        }

        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview
@Composable
fun ButtonAppPreview() {
    ButtonApp(
        data = ButtonData(
            text = "Entrar",
            endIcon = R.drawable.arrow_back
        )
    )
}