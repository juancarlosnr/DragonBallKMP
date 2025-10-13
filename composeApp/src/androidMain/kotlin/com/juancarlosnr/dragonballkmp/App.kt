package com.juancarlosnr.dragonballkmp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import com.juancarlosnr.dragonballkmp.ui.home.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        HomeScreen()
    }
}