package coffeemachine

// 装饰类
class EnhancedCoffeeMachine(private val coffeeMachine: CoffeeMachine) : CoffeeMachine by coffeeMachine {

    override fun makeDoubleEspresso() {
        println("once time")
        println("make double espresso")
    }

    fun makeCoffeeWithMilk() {
        coffeeMachine.makeEspresso()
        println("add milk")
    }
}