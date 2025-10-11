package com.juancarlosnr.dragonballkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform