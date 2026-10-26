package com.kevin.calinexo.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.kevin.testapplication.R

data class SearchBarData(
    val icon: Int,
    val text: String,
    val onTextChange: (String) -> Unit
)


@Composable
fun SearchBar(data: SearchBarData, modifier: Modifier = Modifier) {

    TextField(
        value = "",
        onValueChange = data.onTextChange,
        modifier = modifier.fillMaxWidth(),

        placeholder = {
            Text(data.text)
        },

        leadingIcon = {
            Icon(
                painter = painterResource(data.icon),
                contentDescription = "Buscar"
            )
        }
    )
}


@Preview
@Composable
fun SearchBarPreview(){
    SearchBar(data = SearchBarData(
        icon = R.drawable.search,
        text = "Busacar Ejercicio",
        onTextChange = {}
    ),
        modifier = Modifier)
}