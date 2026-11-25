package com.kevin.calinexo.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kevin.calinexo.ui.theme.CalinexoTheme
import com.kevin.testapplication.R

@Composable
fun MyScaffold(screen: @Composable () -> Unit) {
    CalinexoTheme() {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                Box(
                    modifier = Modifier.statusBarsPadding()
                ) {
                    MyTopBar(
                        data = MyTopBarData(
                            logo = R.drawable.logo_mejorado,
                            nombre = "CaliNexo"
                        )
                    )
                }
            },

            bottomBar = {
                Box(
                    modifier = Modifier.navigationBarsPadding()
                ) {
                    MyBottomBar()
                }
            }

        ) { innerPadding ->

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                screen()
            }
        }
    }
}