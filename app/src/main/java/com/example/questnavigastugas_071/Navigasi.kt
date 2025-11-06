package com.example.questnavigastugas_071

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigastugas_071.view.Formulir
import com.example.questnavigastugas_071.view.TampilData
import com.example.questnavigastugas_071.view.WelcomeScreen

enum class Navigasi {
    WelcomeScreen,
    Formulir,
    TampilData
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Navigasi.WelcomeScreen.name
    ) {
        composable(route = Navigasi.WelcomeScreen.name) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Navigasi.Formulir.name) {
            Formulir(navController = navController, viewModel = viewModel())
        }
        composable(route = Navigasi.TampilData.name) {
            TampilData(navController = navController, viewModel = viewModel())
        }
    }
}