package info.maxbehr.designpatternskotlin.creational.prototype

import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class PrototypeTest {

    @Test
    fun testPrototype() {
        ShapeCache.loadCache()
        val clonedShape1 = ShapeCache.getShape("1")
        val clonedShape2 = ShapeCache.getShape("2")
        val clonedShape3 = ShapeCache.getShape("3")

        clonedShape1.draw()
        clonedShape2.draw()
        clonedShape3.draw()

        assertThat(clonedShape1.type).isEqualTo("Circle")
        assertThat(clonedShape2.type).isEqualTo("Square")
        assertThat(clonedShape3.type).isEqualTo("Rectangle")
    }
}