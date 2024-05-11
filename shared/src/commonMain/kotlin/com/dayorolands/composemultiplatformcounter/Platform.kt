package com.dayorolands.composemultiplatformcounter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform