package io.bitrise.my_kmm_demo

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}