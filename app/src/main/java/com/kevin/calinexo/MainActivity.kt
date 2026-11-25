package com.kevin.calinexo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.kevin.calinexo.ui.component.MyScaffold
import com.kevin.calinexo.ui.component.NavGraph
import com.kevin.calinexo.ui.page.ExerciseDetailScreen
import com.kevin.calinexo.ui.page.ExerciseScreen
import kotlinx.serialization.Serializable


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MyScaffold {
                NavGraph(rememberNavController())
            }
        }
    }
}

