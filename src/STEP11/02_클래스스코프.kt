package STEP11

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

class B2 {
    val a = "클래스 스코프"

    fun print() {
        println(a)
    }
}

fun main() {
    val a = "함수 스코프"

    println(a)
    B2().print()
}
