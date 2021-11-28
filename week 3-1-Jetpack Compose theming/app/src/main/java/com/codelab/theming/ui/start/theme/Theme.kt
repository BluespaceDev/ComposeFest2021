package com.codelab.theming.ui.start.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

class Theme {
    @Composable
    fun JetnewsTheme(content: @Composable () -> Unit) {
        MaterialTheme(content = content)
    }
}