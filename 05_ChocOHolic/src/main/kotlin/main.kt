fun main() {
    ChocolateBoiler.fill()
    println(ChocolateBoiler.toString() + "\n")

    ChocolateBoiler.boil()
    println(ChocolateBoiler.toString() + "\n")

    ChocolateBoiler.drain()
    println(ChocolateBoiler.toString())
}

/* Output:

filling the boiler with a milk/chocolate mixture
isEmpty: false, isBoiled: false

bring the contents to a boil
isEmpty: false, isBoiled: true

drain the boiled milk and chocolate
isEmpty: true, isBoiled: true

 */