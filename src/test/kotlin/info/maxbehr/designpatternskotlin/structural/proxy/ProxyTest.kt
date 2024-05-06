package info.maxbehr.designpatternskotlin.structural.proxy

import kotlin.test.Test

class ProxyTest {

    @Test
    fun testProxy() {
        val image = ProxyImage("test.jpg")

        // load image from disk
        image.display()

        // load image from "cache"
        image.display()
    }
}