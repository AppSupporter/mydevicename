package de.heise

expect class Platform() {
    val platform: String
    fun getDeviceName(): String
}