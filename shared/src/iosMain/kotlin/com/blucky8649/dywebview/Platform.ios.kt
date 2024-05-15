package com.blucky8649.dywebview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.interop.UIKitView
import androidx.compose.ui.interop.UIKitViewController
import androidx.compose.ui.window.ComposeUIViewController
import com.blucky8649.dywebview.webView.WebView
import kotlinx.cinterop.ExperimentalForeignApi
import platform.UIKit.UIDevice
import platform.WebKit.WKWebView

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()

fun mainViewController() = ComposeUIViewController {
    MainScreen()
}