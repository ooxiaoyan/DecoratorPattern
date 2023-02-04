package universal

class ConcreteDecorator1(component: Component): Decorator(component) {

    // 重写父类的Operation方法
    override fun operate() {
        this.method1()
        super.operate()
    }

    // 定义自己的修饰方法
    private fun method1() {
        println("method1 修饰 in ConcreteDecorator1")
    }
}