package info.maxbehr.designpatternskotlin.creational.builder

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNull
import kotlin.test.Test

class BuilderTest {

    @Test
    fun testBuilder() {
        val component = Component.Builder()
            .setParam1("some value")
            .setparam3(true)
            .build()

        assertThat(component.param1).isEqualTo("some value")
        assertThat(component.param2).isNull()
        assertThat(component.param3).isEqualTo(true)
    }
}