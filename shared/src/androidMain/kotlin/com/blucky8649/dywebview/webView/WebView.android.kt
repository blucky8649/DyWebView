package com.blucky8649.dywebview.webView

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView

@Composable
actual fun WebView(modifier: Modifier, url: String) {
    val context = LocalContext.current
    AndroidView(
        factory = { WebView(context).apply { webViewClient = WebViewClient() } },
        modifier = Modifier.then(modifier),
        update = { it.loadUrl(url) }
    )
}