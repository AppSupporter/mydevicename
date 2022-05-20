package de.heise

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    fun helloDevice(): String {
        val platform = Platform()

        return "Hello my Name is ${platform.getDeviceName()}"
    }
}