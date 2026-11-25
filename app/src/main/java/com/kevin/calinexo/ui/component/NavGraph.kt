package com.kevin.calinexo.ui.component

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.kevin.calinexo.ui.page.ExerciseDetailScreen
import com.kevin.calinexo.ui.page.ExerciseScreen
import kotlinx.serialization.Serializable


@Serializable
data class DetailPath (val id: String)

@Serializable
object ListPath



@Composable
fun NavGraph(nav: NavHostController) {

    NavHost(
        navController = nav,
        startDestination = com.kevin.calinexo.ui.component.ListPath
    ){
        composable <ListPath>{
            ExerciseScreen(onCardClick = {
                nav.navigate(DetailPath(it))
            })
        }

        composable <DetailPath>{
            val detailPath = it.toRoute<DetailPath>()
            ExerciseDetailScreen(
                detailPath.id)
        }
    }

}