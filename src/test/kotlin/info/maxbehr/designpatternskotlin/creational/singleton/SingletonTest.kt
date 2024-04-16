package info.maxbehr.designpatternskotlin.creational.singleton

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class SingletonTest {

    @Test
    fun testSingleton() {
        val firstInstance = Singleton.showYourself()
        val secondInstance = Singleton.showYourself()
        assertThat(firstInstance.hashCode()).isEqualTo(secondInstance.hashCode())
        assertThat(firstInstance).isSameAs(Singleton)
        assertThat(secondInstance).isSameAs(Singleton)
    }
}

