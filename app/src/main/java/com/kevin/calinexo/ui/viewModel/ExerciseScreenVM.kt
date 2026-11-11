package com.kevin.calinexo.ui.viewModel

import androidx.lifecycle.ViewModel
import com.kevin.calinexo.ui.Seeder
import com.kevin.calinexo.ui.component.FilterOption
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class ExerciseScreenUIState(
    val searchBarText: String = "",
    val filters: List<FilterOption> = emptyList(),
    val levels: List<String> = emptyList()
)

private const val TAG = "ExerciseScreenVM"

class ExerciseScreenVM: ViewModel(){
    private val _uiState = MutableStateFlow(ExerciseScreenUIState())

    val uiState = _uiState.asStateFlow()

    fun load() {
        _uiState.value = _uiState.value.copy(
            filters = Seeder.sendExerciseFilters(),
            levels = Seeder.sendExpandableCategoryLevels()
        )
    }
}