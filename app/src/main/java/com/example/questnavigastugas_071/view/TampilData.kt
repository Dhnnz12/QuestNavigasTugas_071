package com.example.questnavigastugas_071.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringArrayResource
import androidx.navigation.NavHostController
import com.example.questnavigastugas_071.R

@Composable
fun TampilData(navController: NavHostController) {
    val pesertaList = stringArrayResource(id = R.array.data_peserta)
    val gradient = Brush.verticalGradient(
        colors = listOf(Color(0xFFBB86FC), Color(0xFFEFB8C8))
    )



}