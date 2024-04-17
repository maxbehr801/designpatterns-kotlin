package info.maxbehr.designpatternskotlin.creational.singleton

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isSameInstanceAs
import kotlin.test.Test

class SingletonTest {

    @Test
    fun testSingleton() {
        val firstInstance = Singleton.showYourself()
        val secondInstance = Singleton.showYourself()
        assertThat(firstInstance.hashCode()).isEqualTo(secondInstance.hashCode())
        assertThat(firstInstance).isSameInstanceAs(Singleton)
        assertThat(secondInstance).isSameInstanceAs(Singleton)
    }
}

