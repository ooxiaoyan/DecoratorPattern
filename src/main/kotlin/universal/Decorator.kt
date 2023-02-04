package universal

// 抽象装饰者
// 如果只有一个装饰类，则可以没有抽象装饰角色，直接实现具体的装饰角色即可
abstract class Decorator(protected open val component: Component) : Component() {

    // 委托给被修饰者执行
    override fun operate() {
        component.operate()
    }
}