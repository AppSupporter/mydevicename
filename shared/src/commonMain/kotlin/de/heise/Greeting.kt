package de.heise

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}