package com.kevin.calinexo.ui.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.ui.Seeder
import com.kevin.calinexo.ui.component.ExerciseFilters
import com.kevin.calinexo.ui.component.ExerciseFiltersData
import com.kevin.calinexo.ui.component.ExpandableCategoryZone
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

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(top = 16.dp)
                .padding(horizontal = 20.dp)
        ) {


            //Barra de busqueda

            SearchBar(
                data = SearchBarData(
                    icon = R.drawable.search,
                    text = "",
                    onTextChange = {}
                ))


            Spacer(
                modifier = Modifier.height(20.dp))





            //Filtros

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {

                Row(
                    modifier = Modifier
                        .background(
                            color = SecondaryColor,
                            shape = RoundedCornerShape(50.dp)
                        )
                        .padding(4.dp)
                ) {

                    ExerciseFilters(
                        data = ExerciseFiltersData(
                            filters = Seeder.sendExerciseFilters(),
                            selected = Seeder.sendExerciseFilters()[0],
                            backgroundColor = SecondaryColor
                        )
                    )
                }
            }


            Spacer(
                modifier = Modifier.height(30.dp))



            //Niveles

            ExpandableCategoryZone(
                list = Seeder.sendExpandableCategoryData(),

                )
        }

    }
}

@Preview
@Composable
fun ExerciseScreenPreview() {
    ExerciseScreen()
}