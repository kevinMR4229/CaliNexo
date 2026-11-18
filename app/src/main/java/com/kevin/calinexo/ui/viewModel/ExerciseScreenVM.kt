package com.kevin.calinexo.ui.viewModel

import androidx.lifecycle.ViewModel
import com.kevin.calinexo.model.DifficultyLevel
import com.kevin.calinexo.model.Exercise
import com.kevin.calinexo.repo.Seeder
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class ExerciseScreenUIState(
    val filter: String = "",
    val levels: List<DifficultyLevel> = emptyList(),
    val selectedLevel: DifficultyLevel = DifficultyLevel.BEGINNER,
    val exercises: List<Exercise> = emptyList()
)

class ExerciseScreenVM : ViewModel() {
    private val _uiState = MutableStateFlow(ExerciseScreenUIState())

    val uiState = _uiState.asStateFlow()

    fun load() {

        _uiState.value = _uiState.value.copy(
            levels = DifficultyLevel.entries,
            exercises = Seeder.getAllExercises()
        )
    }

    fun onFilterChange(filter: String) {
        _uiState.update {
            it.copy(
                filter = filter,
                exercises = Seeder.getAllExercises()
                    .filter { exercise ->
                        exercise.name.contains(filter, ignoreCase = true)
                    }
            )
        }

    }

    fun onLevelSelected(level: DifficultyLevel) {

        _uiState.update {
            it.copy(
                selectedLevel = level,
                exercises = Seeder.getAllExercises()
                    .filter { exercise ->
                        exercise.difficulty == level
                    }
            )
        }
    }


}