package STEP20

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    val a = Product("aa", 1000)
    val b = Product("bb", 2000)
    var c = a
    var d = Product("cc", 3000)

    println(a == b) // false
    println(a === b) // false

    println(a == c) // true
    println(a === c) // true

    println(a == d) // false
    println(a === d) // flase 
}

class Product(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Product) {
            return other.name == name && other.price == price
        } else {
            return super.equals(other)
        }
    }
}
