package com.alexbalan.nav3sample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Nav3Sample",
    ) {
        App()
    }
}