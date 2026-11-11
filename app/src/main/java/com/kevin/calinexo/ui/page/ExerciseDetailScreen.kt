package com.kevin.calinexo.ui.page


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.tooling.preview.Preview
import com.kevin.calinexo.ui.component.PageTitleData
import com.kevin.calinexo.ui.component.pageTitle
import com.kevin.testapplication.R
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kevin.calinexo.ui.component.ButtonApp
import com.kevin.calinexo.ui.component.ButtonData
import com.kevin.calinexo.ui.component.ExerciseMediaCard
import com.kevin.calinexo.ui.component.ExerciseMediaCarddata
import com.kevin.calinexo.ui.component.InstructionStepZone
import com.kevin.calinexo.ui.component.MuscleGroupSection
import com.kevin.calinexo.ui.component.MuscleGroupSectionData
import com.kevin.calinexo.ui.theme.LettersBlackBackground
import com.kevin.calinexo.ui.theme.PrimaryColor
import com.kevin.calinexo.ui.viewModel.ExerciseDetailScreenVM


@Composable
fun ExerciseDetailScreen(vm: ExerciseDetailScreenVM = viewModel(), modifier: Modifier = Modifier) {

    LaunchedEffect(Unit) {
        vm.load()
    }

    val state = vm.uiState.collectAsState()


    Column(
        modifier = modifier
            .padding(horizontal = 20.dp)
    ){
        pageTitle(
            data = PageTitleData(
                pageTittle = state.value.pageTitle,
                arrowBack = R.drawable.arrow_back,
                heart = R.drawable.ic_favorite_border,
                onIconoIzq = {},
                onIconoDer = {}
            ),
            modifier = Modifier
                .padding(bottom = 5.dp)
        )

        ExerciseMediaCard(
            data = ExerciseMediaCarddata(
                image = R.drawable.imagen_dominadas_prueba,
                level = state.value.exerciseLevel,
                time = 34,
                strengh = "Fuerza base"
            )
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        MuscleGroupSection(
            data = MuscleGroupSectionData(
                title = "Musculos Principales",
                muscles = state.value.muscles
            ),
            modifier = Modifier
                .padding(top = 5.dp)
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            modifier = Modifier,
            text = "Como realizarlo",
            color = LettersBlackBackground,
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        InstructionStepZone(
            data = state.value.instructionSteps
        )


        Spacer(
            modifier = Modifier.height(16.dp)
        )

        ButtonApp(
            data = ButtonData(
                text = "Entrar",
                textColor = LettersBlackBackground,
                backgroundColor = PrimaryColor,
                endIcon = R.drawable.arrow_back
            )
        )
    }









    //Scaffold(
    //    containerColor = BackgroundColor,
    //    topBar = {
    //        header(
    //            data = HeaderData(
    //                logo = R.drawable.logo_mejorado,
    //                nombre = "CaliNexo"
    //            )
    //        )
    //    },
    //    bottomBar = {
    //        Footer()
    //    }
    //) { innerPadding ->
//
    //    Column(
    //        modifier = Modifier
    //            .padding(innerPadding)
    //            .padding(horizontal = 20.dp)
    //    ) {
    //        pageTitle(
    //            data = PageTitleData(
    //                pageTittle = "Dominadas",
    //                arrowBack = R.drawable.arrow_back,
    //                heart = R.drawable.ic_favorite_border,
    //                onIconoIzq = {},
    //                onIconoDer = {}
    //            ),
    //            modifier = Modifier
    //                .padding(bottom = 5.dp)
    //        )
//
    //        ExerciseMediaCard(
    //            data = ExerciseMediaCarddata(
    //                image = R.drawable.imagen_dominadas_prueba,
    //                level = "Intermedio",
    //                time = 34,
    //                strengh = "Fuerza base"
    //            )
    //        )
//
    //        Spacer(
    //            modifier = Modifier.height(16.dp)
    //        )
//
    //        MuscleGroupSection(
    //            data = MuscleGroupSectionData(
    //                title = "Musculos Principales",
    //                muscles = listOf(
    //                    Muscle(
    //                        name = "Biceps",
    //                        effort = Effort.HIGH
    //                    ), Muscle(
    //                        name = "Core",
    //                        effort = Effort.MEDIUM
    //                    ),
    //                    Muscle(
    //                        name = "Piernas",
    //                        effort = Effort.LOW
    //                    )
    //                )
    //            ),
    //            modifier = Modifier
    //                .padding(top = 5.dp)
    //        )
//
    //        Spacer(
    //            modifier = Modifier.height(20.dp)
    //        )
//
    //        Text(
    //            modifier = Modifier,
    //            text = "Como realizarlo",
    //            color = LettersBlackBackground,
    //            style = MaterialTheme.typography.bodyMedium
    //        )
//
    //        Spacer(
    //            modifier = Modifier.height(16.dp)
    //        )
//
    //        InstructionStepZone(
    //            data = Seeder.sendInstructionStepCards()
    //        )
//
//
    //        Spacer(
    //            modifier = Modifier.height(16.dp)
    //        )
//
    //        ButtonApp(
    //            data = ButtonData(
    //                text = "Entrar",
    //                textColor = LettersBlackBackground,
    //                backgroundColor = PrimaryColor,
    //                endIcon = R.drawable.arrow_back
    //            )
    //        )
    //    }
//
    //}
}


@Preview
@Composable
fun ExerciseDetailScreenPreview() {
    ExerciseDetailScreen()
}