package duckTest

class Duck(var name: String, var weight: Int) : Comparable<Duck> {

    override fun toString(): String {
        return "$name weighs $weight"
    }

    override fun compareTo(other: Duck): Int {
        return this.weight.compareTo(other.weight)
    }
}