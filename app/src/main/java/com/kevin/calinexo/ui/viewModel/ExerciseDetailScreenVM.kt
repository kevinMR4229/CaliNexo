package com.kevin.calinexo.ui.viewModel

import androidx.lifecycle.ViewModel
import com.kevin.calinexo.model.Exercise
import com.kevin.calinexo.repo.Seeder
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class ExerciseDetailScreenUIState(
    val exercise: Exercise? = null
)

private const val TAG = "ExerciseDetailScreenVM"

class ExerciseDetailScreenVM : ViewModel() {
    private val _uiState = MutableStateFlow(ExerciseDetailScreenUIState())

    val uiState = _uiState.asStateFlow()

    //Cargar los datos
    fun load(id: String) {

        _uiState.value = _uiState.value.copy(
            exercise = Seeder.getExerciseById(id)

        )
    }

    fun onEnter(){

    }
}

