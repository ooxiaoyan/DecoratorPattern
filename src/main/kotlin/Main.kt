import universal.Component
import universal.ConcreteComponent
import universal.ConcreteDecorator1
import universal.ConcreteDecorator2

fun main(args: Array<String>) {
    var component: Component = ConcreteComponent()
    // 第一次修饰
    component = ConcreteDecorator1(component)
    // 第二次修饰
    component = ConcreteDecorator2(component)
    // 修饰后运行
    component.operate()
}