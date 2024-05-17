package info.maxbehr.designpatternskotlin.behavioural.mediator

import kotlin.test.Test

class MediatorTest {

    @Test
    fun testMediator() {
        val mediator = Mediator()
        val alice = ChatUser(mediator, "Alice")
        val bob = ChatUser(mediator, "Bob")
        val carol = ChatUser(mediator, "Carol")

        mediator
            .addUser(alice)
            .addUser(bob)
            .addUser(carol)

        carol.send("Hi everyone")
    }
}