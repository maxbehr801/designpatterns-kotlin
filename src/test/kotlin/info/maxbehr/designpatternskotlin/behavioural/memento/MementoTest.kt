package info.maxbehr.designpatternskotlin.behavioural.memento

import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class MementoTest {

    @Test
    fun testMemento() {
        val originator = Originator("initial state")
        val careTaker = CareTaker()
        careTaker.saveSate(originator.createMemento())
        println("Current state is: ${originator.state}")

        originator.state = "state 1"
        careTaker.saveSate(originator.createMemento())
        println("Current state is: ${originator.state}")

        originator.state = "state 2"
        careTaker.saveSate(originator.createMemento())
        println("Current state is: ${originator.state}")

        assertThat(originator.state).isEqualTo("state 2")

        originator.restoreMemento(careTaker.restoreSate(1))
        assertThat(originator.state).isEqualTo("state 1")
        println("Current state is: ${originator.state}")

        originator.restoreMemento(careTaker.restoreSate(0))
        assertThat(originator.state).isEqualTo("initial state")
        println("Current state is: ${originator.state}")

        originator.restoreMemento(careTaker.restoreSate(2))
        assertThat(originator.state).isEqualTo("state 2")
        println("Current state is: ${originator.state}")
    }
}