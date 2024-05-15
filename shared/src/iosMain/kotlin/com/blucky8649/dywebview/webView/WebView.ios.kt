package com.blucky8649.dywebview.webView

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.interop.UIKitView
import androidx.compose.ui.window.ComposeUIViewController
import kotlinx.cinterop.ExperimentalForeignApi
import platform.Foundation.NSMutableURLRequest
import platform.Foundation.NSURL
import platform.WebKit.WKNavigationDelegateProtocol
import platform.WebKit.WKWebView
import platform.darwin.NSObject

@OptIn(ExperimentalForeignApi::class)
@Composable
actual fun WebView(modifier: Modifier, url: String) {
    val webView = remember { WKWebView() }
    val request = NSMutableURLRequest.requestWithURL(URL = NSURL(string = url))
    
    webView.apply {
        loadRequest(request)
        navigationDelegate = NKNavigationDelegate()
        allowsBackForwardNavigationGestures = true
    }
    
    UIKitView(
        factory = { webView },
        modifier = Modifier.fillMaxSize().then(modifier)
    )
}

fun WebViewController() = ComposeUIViewController { WebView(url = "https://www.naver.com") }

class NKNavigationDelegate(): NSObject(), WKNavigationDelegateProtocol {}