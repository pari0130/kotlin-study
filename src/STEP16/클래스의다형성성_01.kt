package STEP16

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()

    // is 를 통해 b 가 Cola 와 호환되는지 체크
    if (b is Cola) {
        b.washDishes()
    }

    // as 를 이용한 캐스팅
    var c = b as Cola
    c.washDishes()
    b.washDishes()
}

open class Drink {
    var name = "음료"

    open fun drink() {
        println("${name}를 마십니다")
    }
}

class Cola : Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}를 마십니다")
    }

    fun washDishes() {
        println("${type}로 설거지를 합니다다")
    }
}
