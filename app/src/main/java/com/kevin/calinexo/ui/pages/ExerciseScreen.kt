package com.kevin.calinexo.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.ui.component.Footer
import com.kevin.calinexo.ui.component.HeaderData
import com.kevin.calinexo.ui.component.SearchBar
import com.kevin.calinexo.ui.component.SearchBarData
import com.kevin.calinexo.ui.component.header
import com.kevin.calinexo.ui.theme.BackgroundColor
import com.kevin.calinexo.ui.theme.SecondaryColor
import com.kevin.testapplication.R


@Composable
fun ExerciseScreen() {

    Scaffold(
        containerColor = BackgroundColor,
        topBar = {
            header(
                data = HeaderData(
                    logo = R.drawable.logo_mejorado,
                    nombre = "CaliNexo"
                )
            )
        },
        bottomBar = {
            Footer()
        }
    ) { innerPadding ->

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            SearchBar(
                data = SearchBarData(
                icon = R.drawable.search,
                text = "",
                onTextChange = {}
            ),
                modifier = Modifier
                    .background(
                        color = SecondaryColor,
                        shape = RoundedCornerShape(50)
                    ))
        }

    }
}

@Preview
@Composable
fun ExerciseScreenPreview(){
    ExerciseScreen()
}