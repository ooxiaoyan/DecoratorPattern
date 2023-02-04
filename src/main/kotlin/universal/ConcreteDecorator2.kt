package universal

class ConcreteDecorator2(component: Component): Decorator(component) {

    // 重写父类的Operation方法
    override fun operate() {
        super.operate()
        this.method2()
    }

    // 定义自己的修饰方法
    private fun method2() {
        println("method2 修饰 in ConcreteDecorator2")
    }
}