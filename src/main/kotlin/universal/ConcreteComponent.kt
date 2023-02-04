package universal

// 具体构件
class ConcreteComponent : Component() {

    // 具体实现
    override fun operate() {
        println("do something in ConcreteComponent")
    }
}