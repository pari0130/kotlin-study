package STEP20

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    val a : String? = null

    println(a?.toUpperCase()) // null
    println(a?:"default".toUpperCase()) // DEFAULT
    // println(a!!.toUpperCase()) // error null 이 아닌 경우를 나타냄 !!

    // null safe 하게 처리하는 방법
    a?.run{
        println(toUpperCase())
        println(toUpperCase())
    }

    // b 가 null 이 아니므로 처리 됨
    val b : String? = "kotlin exam"
    b?.run{
        println(toUpperCase())
    }
}
