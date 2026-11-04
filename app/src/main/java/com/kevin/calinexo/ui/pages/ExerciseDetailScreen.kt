package com.kevin.calinexo.ui.pages

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kevin.calinexo.ui.component.Footer
import com.kevin.calinexo.ui.component.HeaderData
import com.kevin.calinexo.ui.component.PageTitleData
import com.kevin.calinexo.ui.component.header
import com.kevin.calinexo.ui.component.pageTitle
import com.kevin.testapplication.R
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.kevin.calinexo.ui.Seeder
import com.kevin.calinexo.ui.component.ButtonApp
import com.kevin.calinexo.ui.component.ButtonData
import com.kevin.calinexo.ui.component.Effort
import com.kevin.calinexo.ui.component.ExerciseMediaCard
import com.kevin.calinexo.ui.component.ExerciseMediaCarddata
import com.kevin.calinexo.ui.component.InstructionStepZone
import com.kevin.calinexo.ui.component.InstructionStepZoneData
import com.kevin.calinexo.ui.component.Muscle
import com.kevin.calinexo.ui.component.MuscleGroupSection
import com.kevin.calinexo.ui.component.MuscleGroupSectionData
import com.kevin.calinexo.ui.theme.BackgroundColor
import com.kevin.calinexo.ui.theme.LettersBlackBackground
import com.kevin.calinexo.ui.theme.PrimaryColor


@Composable
fun ExerciseDetailScreen(){

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

        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            item {
                pageTitle(
                    data = PageTitleData(
                        pageTittle = "Dominadas",
                        arrowBack = R.drawable.arrow_back,
                        heart = R.drawable.ic_favorite_border,
                        onIconoIzq = {},
                        onIconoDer = {}
                    ),
                    modifier = Modifier
                        .padding(bottom = 5.dp)
                )
            }

            item {
                ExerciseMediaCard(
                    data = ExerciseMediaCarddata(
                        image = R.drawable.imagen_dominadas_prueba,
                        level = "Intermedio",
                        time = 34,
                        strengh = "Fuerza base"
                    ),
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                )
            }

            item {
                Spacer(
                    modifier = Modifier.height(16.dp)
                )
            }

            item {
                MuscleGroupSection(
                    data = MuscleGroupSectionData(
                        title = "Musculos Principales",
                        muscles = listOf(
                            Muscle(
                                name = "Biceps",
                                effort = Effort.HIGH
                            ), Muscle(
                                name = "Core",
                                effort = Effort.MEDIUM
                            ),
                            Muscle(
                                name = "Piernas",
                                effort = Effort.LOW
                            )
                        )
                    ),
                    modifier = Modifier
                        .padding(start = 20.dp, top = 5.dp)
                )
            }

            item {
                Spacer(
                    modifier = Modifier.height(20.dp)
                )
            }

            item {
                Text(
                    modifier = Modifier
                        .padding(start = 20.dp),
                    text = "Como realizarlo",
                    color = LettersBlackBackground,
                    style = MaterialTheme.typography.bodyMedium
                )
            }

            item {
                Spacer(
                    modifier = Modifier.height(16.dp)
                )
            }

            item {
                InstructionStepZone(data = InstructionStepZoneData(
                    list = Seeder.
                ))
            }


            item {
                Spacer(
                    modifier = Modifier.height(16.dp)
                )
            }

            item {
                ButtonApp(
                    data = ButtonData(
                        text = "Entrar",
                        textColor = LettersBlackBackground,
                        backgroundColor = PrimaryColor,
                        endIcon = R.drawable.arrow_back
                    ),
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                )
            }
        }

    }
}


@Preview
@Composable
fun ExerciseDetailScreenPreview(){
    ExerciseDetailScreen()
}