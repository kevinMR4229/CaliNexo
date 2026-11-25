package com.kevin.calinexo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.kevin.calinexo.ui.component.MyScaffold
import com.kevin.calinexo.ui.page.ExerciseDetailScreen
import com.kevin.calinexo.ui.page.ExerciseScreen
import kotlinx.serialization.Serializable

@Serializable
data class DetailPath (val id: String)

@Serializable
object ListPath

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val myNavController = rememberNavController()

            MyScaffold {
                NavHost(
                    navController = myNavController,
                    startDestination = ListPath
                ){
                    composable <ListPath>{
                        //ExerciseScreen()
                    }

                    composable <DetailPath>{
                        val detailPath = it.toRoute<DetailPath>()
                        ExerciseDetailScreen(detailPath.id)
                    }
                }
                ExerciseDetailScreen("push_up")
            }
        }
    }
}

