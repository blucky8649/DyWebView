package com.blucky8649.dywebview

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform