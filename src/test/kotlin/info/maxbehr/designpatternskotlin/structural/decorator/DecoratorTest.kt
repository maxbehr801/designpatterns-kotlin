package info.maxbehr.designpatternskotlin.structural.decorator

import kotlin.test.Test

class DecoratorTest {

    @Test
    fun testDecorator() {
        val normalCoffeeMachine = NormalCoffeeMachine()
        val enhancedCoffeeMachine = EnhancedCoffeeMachine(normalCoffeeMachine)

        println("-------make small coffee-------")
        enhancedCoffeeMachine.makeSmallCoffee()
        println("-------make large coffee-------")
        enhancedCoffeeMachine.makeLargeCoffee()
        println("-------make milk coffee-------")
        enhancedCoffeeMachine.makeMilkCoffee()
    }
}