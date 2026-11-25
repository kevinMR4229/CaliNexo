package com.kevin.calinexo.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kevin.calinexo.ui.theme.CalinexoTheme
import com.kevin.testapplication.R

@Composable
fun MyScaffold(screen: Unit) {
    CalinexoTheme() {
        Scaffold(
            topBar = {
                MyTopBar(
                    data = MyTopBarData(
                        logo = R.drawable.logo_mejorado,
                        nombre = "CaliNexo"
                    )
                )
            },

            bottomBar = {
                MyBottomBar()
            }

        ) { innerPadding ->
            Column(modifier = Modifier.padding(innerPadding)) { }
            screen
        }
    }
}