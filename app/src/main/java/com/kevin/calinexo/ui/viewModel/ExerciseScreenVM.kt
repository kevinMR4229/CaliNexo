package com.kevin.calinexo.ui.viewModel

import androidx.lifecycle.ViewModel
import com.kevin.calinexo.model.DifficultyLevel
import com.kevin.calinexo.model.Exercise
import com.kevin.calinexo.repo.Seeder
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class ExerciseScreenUIState(
    val searchText: String = "",
    val levels: List<DifficultyLevel> = emptyList(),
    val selectedLevel: DifficultyLevel = DifficultyLevel.BEGINNER,
    val exercises: List<Exercise> = emptyList()
)

private const val TAG = "ExerciseScreenVM"

class ExerciseScreenVM : ViewModel() {
    private val _uiState = MutableStateFlow(ExerciseScreenUIState())

    val uiState = _uiState.asStateFlow()

    fun load() {

        _uiState.value = _uiState.value.copy(
            levels = DifficultyLevel.entries,
            exercises = Seeder.getAllExercises()
        )
    }

    fun onLevelSelected(level: DifficultyLevel) {

        val exercises = Seeder.getAllExercises()
            .filter { it.difficulty == level }

        _uiState.value = _uiState.value.copy(
            selectedLevel = level,
            exercises = exercises
        )
    }

    fun onSearchTextChange(text: String) {
        _uiState.value = _uiState.value.copy(
            searchText = text
        )
    }
}