package com.kevin.calinexo.ui.viewModel

import androidx.lifecycle.ViewModel
import com.kevin.calinexo.ui.Seeder
import com.kevin.calinexo.ui.component.Instruction
import com.kevin.calinexo.ui.component.Muscle
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class ExerciseDetailScreenUIState(
    val pageTitle: String = "",
    val exerciseLevel: String = "",
    val muscles: List<Muscle> = emptyList(),
    val instructionSteps: List<Instruction> = emptyList()
)

private const val TAG = "ExerciseDetailScreenVM"

class ExerciseDetailScreenVM : ViewModel() {
    private val _uiState = MutableStateFlow(ExerciseDetailScreenUIState())

    val uiState = _uiState.asStateFlow()

    //Cargar los datos
    fun load() {
        _uiState.value = _uiState.value.copy(
            pageTitle = "Dominadas",
            exerciseLevel = "Intermedio",
            muscles = Seeder.sendMuscles(),
            instructionSteps = Seeder.sendInstructionStepData()

        )
    }

    fun onEnter(){

    }
}

