// object gives us singleton functionality
object ChocolateBoiler {

    var isEmpty = true
        private set

    var isBoiled = false
        private set

    fun fill() {
        if (isEmpty) {
            isEmpty = false
            isBoiled = false
            println("filling the boiler with a milk/chocolate mixture")
        }
    }

    fun drain() {
        if (!isEmpty && isBoiled) {
            println("drain the boiled milk and chocolate")
            isEmpty = true
        }
    }

    fun boil() {
        if (!isEmpty && !isBoiled) {
            println("bring the contents to a boil")
            isBoiled = true
        }
    }

    override fun toString(): String {
        return "isEmpty: $isEmpty, isBoiled: $isBoiled"
    }
}