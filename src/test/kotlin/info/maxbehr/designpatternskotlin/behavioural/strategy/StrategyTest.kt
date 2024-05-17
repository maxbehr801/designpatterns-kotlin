package info.maxbehr.designpatternskotlin.behavioural.strategy

import org.junit.jupiter.api.Test

class StrategyTest {

    @Test
    fun testStrategy() {
        val inputString = "LOREM ipsum DOLOR sit amet"

        val lowerCasePrinter = Printer(lowercaseFormatter)
        lowerCasePrinter.printString(inputString)

        val upperCasePrinter = Printer(uppercaseFormatter)
        upperCasePrinter.printString(inputString)

        val standardPrinter = Printer({it: String -> it})
        standardPrinter.printString(inputString)
    }
}