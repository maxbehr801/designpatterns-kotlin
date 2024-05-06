package info.maxbehr.designpatternskotlin.structural.bridge

import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class BridgeTest {

    @Test
    fun testBridge() {
        val tv = TV()
        val radio = Radio()

        val tvRemote = BasicRemote(tv)
        val radioRemote = BasicRemote(radio)

        tvRemote.volumeUp()
        tvRemote.volumeUp()
        tvRemote.volumeDown()

        radioRemote.volumeUp()
        radioRemote.volumeUp()
        radioRemote.volumeUp()
        radioRemote.volumeDown()

        assertThat(tv.volume).isEqualTo(1)
        assertThat(radio.volume).isEqualTo(2)
    }
}