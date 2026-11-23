package com.kevin.calinexo.ui.component

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.kevin.calinexo.ui.page.ExerciseDetailScreen
import kotlinx.serialization.Serializable


@Serializable
object RutMuscleList {
}

@Serializable
data class RutMuscleDetail(var id: Int) {
}


//@Composable
//fun NavGraph(nav: NavHostController) {
//
//    NavHost(
//        navController = nav,
//        startDestination = RutMuscleList
//    ) {
//        composable<RutMuscleList> {
//            ExerciseDetailScreen(onCardClick = { nav.navigate(RutMuscleDetail(it)) })
//        }
//
//        composable<RutMuscleDetail> {
//            val detailRute = it.toRoute<RutMuscleDetail>()
//            ExerciseDetailScreen(
//                detailRute.id,
//                onGoBack
//            )
//        }
//    }
//
//}