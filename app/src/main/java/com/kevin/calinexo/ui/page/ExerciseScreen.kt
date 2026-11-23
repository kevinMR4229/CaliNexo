package com.kevin.calinexo.ui.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kevin.calinexo.model.DifficultyLevel
import com.kevin.calinexo.ui.component.ExerciseCard
import com.kevin.calinexo.ui.component.ExerciseCardData
import com.kevin.calinexo.ui.component.ExerciseFilters
import com.kevin.calinexo.ui.component.ExerciseFiltersData
import com.kevin.calinexo.ui.component.SearchBar
import com.kevin.calinexo.ui.component.SearchBarData
import com.kevin.calinexo.ui.theme.AdvancedLevel
import com.kevin.calinexo.ui.theme.BeginnerLevel
import com.kevin.calinexo.ui.theme.CalinexoTheme
import com.kevin.calinexo.ui.theme.IntermediateLevel
import com.kevin.calinexo.ui.theme.ProLevel
import com.kevin.calinexo.ui.viewModel.ExerciseScreenVM
import com.kevin.testapplication.R


@Composable
fun ExerciseScreen(
    modifier: Modifier = Modifier,
    vm: ExerciseScreenVM = viewModel()
) {

    LaunchedEffect(Unit) {
        vm.load()
    }

    val state = vm.uiState.collectAsState()


    Column(
        modifier = modifier
            .padding(horizontal = 20.dp)
    ) {

        //Barra de busqueda

        SearchBar(
            data = SearchBarData(
                icon = R.drawable.search,
                text = state.value.filter,
                onTextChange = vm::onFilterChange
            )
        )


        Spacer(
            modifier = Modifier.height(20.dp)
        )


        //Filtros

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {

            Row(
                modifier = Modifier
                    .background(
                        color = MaterialTheme.colorScheme.surfaceContainer,
                        shape = RoundedCornerShape(50.dp)
                    )
            ) {

                ExerciseFilters(
                    data = ExerciseFiltersData(
                        levels = state.value.levels,
                        selectedLevel = state.value.selectedLevel,
                        onLevelSelected = vm::onLevelSelected
                    )
                )
            }
        }


        Spacer(
            modifier = Modifier.height(30.dp)
        )


        //Niveles

        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {

            items(state.value.exercises) { exercise ->

                ExerciseCard(
                    data = ExerciseCardData(
                        tittle = exercise.name,
                        subTittle = exercise.difficulty,
                        image = exercise.image,
                        subtittleColor = when (exercise.difficulty) {
                            DifficultyLevel.BEGINNER ->
                                BeginnerLevel

                            DifficultyLevel.INTERMEDIATE ->
                                IntermediateLevel

                            DifficultyLevel.ADVANCED ->
                                AdvancedLevel

                            DifficultyLevel.PRO ->
                                ProLevel
                        }
                    )
                )

                Spacer(
                    modifier = Modifier.height(10.dp)
                )
            }
        }
    }
}


@Preview
@Composable
fun ExerciseScreenPreview() {
    CalinexoTheme() {
        Surface(
            color = MaterialTheme.colorScheme.background
        ){
            ExerciseScreen()
        }

    }

}
