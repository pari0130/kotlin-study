package STEP11

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

val a = "패키지 스코프"

fun main() {
    println(a)
    B().print()
}

class B {
    fun print(){
        println(a)
    }
}



