package com.cheterz.cocktails

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform