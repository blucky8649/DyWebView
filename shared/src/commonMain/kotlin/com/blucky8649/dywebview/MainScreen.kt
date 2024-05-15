package com.blucky8649.dywebview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.blucky8649.dywebview.webView.WebView

@Composable
fun MainScreen() {
    MaterialTheme {
        WebView(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray),
            url = "https://www.naver.com"
        )
    }
}