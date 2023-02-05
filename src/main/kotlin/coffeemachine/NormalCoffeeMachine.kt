package coffeemachine

// 具体构件-普通咖啡机
class NormalCoffeeMachine: CoffeeMachine {

    override fun makeEspresso() {
        println("make espresso")
    }

    override fun makeDoubleEspresso() {
        println("make double espresso twice")
    }
}