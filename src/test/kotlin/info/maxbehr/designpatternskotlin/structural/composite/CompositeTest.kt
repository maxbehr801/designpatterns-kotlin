package info.maxbehr.designpatternskotlin.structural.composite

import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class CompositeTest {

    @Test
    fun testComposite() {
        val memory = Memory().add(ROM()).add(RAM())
        val pc = Computer().add(memory).add(Processor()).add(HardDrive())
        println("PC price: ${pc.price}")

        assertThat(pc.name).isEqualTo("PC")
        assertThat(pc.price).isEqualTo(1425)
    }
}