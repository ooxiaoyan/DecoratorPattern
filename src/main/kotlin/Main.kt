import coffeemachine.EnhancedCoffeeMachine
import coffeemachine.NormalCoffeeMachine
import universal.Component
import universal.ConcreteComponent
import universal.ConcreteDecorator1
import universal.ConcreteDecorator2

fun main(args: Array<String>) {

    // ------------------------ coffee machine ---------------------------
    val normalCoffeeMachine = NormalCoffeeMachine()
    val enhancedCoffeeMachine = EnhancedCoffeeMachine(normalCoffeeMachine)

    enhancedCoffeeMachine.makeEspresso() // 非重写
    enhancedCoffeeMachine.makeDoubleEspresso() // 重写了
    enhancedCoffeeMachine.makeCoffeeWithMilk() 

    // ------------------------ universal ---------------------------
    var component: Component = ConcreteComponent()
    // 第一次修饰
    component = ConcreteDecorator1(component)
    // 第二次修饰
    component = ConcreteDecorator2(component)
    // 修饰后运行
    component.operate()
}