package info.maxbehr.designpatternskotlin.behavioural.command

import kotlin.test.Test

class CommandTest {

    @Test
    fun testCommand() {
        CommandProcessor()
            .addToQueue(OrderAddCommand(1L))
            .addToQueue(OrderAddCommand(1))
            .addToQueue(OrderPayCommand(2L))
            .addToQueue(OrderPayCommand(1L))
            .processCommands()
    }
}