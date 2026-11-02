package com.kevin.calinexo.ui.pages

import android.annotation.SuppressLint
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kevin.calinexo.ui.component.Footer
import com.kevin.calinexo.ui.component.HeaderData
import com.kevin.calinexo.ui.component.PageTitleData
import com.kevin.calinexo.ui.component.header
import com.kevin.calinexo.ui.component.pageTitle
import com.kevin.testapplication.R


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ExerciseDetailScreen(){

    Scaffold(
        topBar = {
            header(
                data = HeaderData(
                    logo = R.drawable.logo_mejorado,
                    nombre = "CaliNexo"
                )
            )
        },
        bottomBar = {
            Footer()
        }
    ) {

        LazyColumn() {
            item {
                pageTitle(
                    data = PageTitleData(
                        pageTittle = "Dominadas",
                        arrowBack = R.drawable.arrow_back,
                        heart = R.drawable.ic_favorite_border,
                        onIconoIzq = {},
                        onIconoDer = {}
                    )
                )
            }
        }

    }
}


@Preview
@Composable
fun ExerciseDetailScreenPreview(){
    ExerciseDetailScreen()
}