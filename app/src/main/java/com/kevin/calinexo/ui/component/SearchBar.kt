package com.kevin.calinexo.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.testapplication.R

data class SearchBarData(
    val icon: Int,
    val text: String,
    val onTextChange: (String) -> Unit
)

@Composable
fun SearchBar(
    data: SearchBarData,
    modifier: Modifier = Modifier
) {

    TextField(
        value = data.text,
        onValueChange = data.onTextChange,
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(50.dp),

        colors = TextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.surfaceContainer,
            unfocusedContainerColor = MaterialTheme.colorScheme.surfaceContainer,

            focusedTextColor = MaterialTheme.colorScheme.onSurface,
            unfocusedTextColor = MaterialTheme.colorScheme.onSurface,

            focusedPlaceholderColor = MaterialTheme.colorScheme.onSurfaceVariant,
            unfocusedPlaceholderColor = MaterialTheme.colorScheme.onSurfaceVariant,

            focusedLeadingIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
            unfocusedLeadingIconColor = MaterialTheme.colorScheme.onSurfaceVariant,

            cursorColor = MaterialTheme.colorScheme.primary,

            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),

        placeholder = {
            Text("Buscar Ejercicio")
        },

        leadingIcon = {
            Icon(
                painter = painterResource(data.icon),
                contentDescription = "Buscar"
            )
        },

        singleLine = true
    )
}

@Preview
@Composable
fun SearchBarPreview() {

    SearchBar(
        data = SearchBarData(
            icon = R.drawable.search,
            text = "",
            onTextChange = {}
        )
    )
}