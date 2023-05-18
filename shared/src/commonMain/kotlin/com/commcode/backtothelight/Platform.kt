package com.commcode.backtothelight

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform