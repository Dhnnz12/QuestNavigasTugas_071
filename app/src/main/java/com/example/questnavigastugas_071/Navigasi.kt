package com.example.questnavigastugas_071

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
// Pastikan Anda sudah meng-import file Composable lainnya
// import com.example.questnavigastugas_071.ui.WelcomeScreen
// import com.example.questnavigastugas_071.ui.TampilData
// import com.example.questnavigastugas_071.ui.Formulir

// Menggunakan Enum untuk rute adalah praktik yang baik untuk menghindari kesalahan ketik
enum class PengelolaHalaman {
    Welcome,
    ListPeserta,
    Formulir
}

@Composable
fun Navigasiku(navController: NavHostController = rememberNavController()) {

    NavHost(
        navController = navController,
        startDestination = PengelolaHalaman.Welcome.name // Menggunakan Enum sebagai startDestination
    ){
        composable(route = PengelolaHalaman.Welcome.name) {
        }
        composable(route = PengelolaHalaman.ListPeserta.name) {
        }
        composable(route = PengelolaHalaman.Formulir.name) {
        }
    }
}
