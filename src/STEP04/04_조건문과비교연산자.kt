package STEP04

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    val a = 11
    if (a > 10) {
        println("${a} 는 10보다 크다")
    } else {
        println("${a} 는 10보다 작다")
    }

    doWhen(a)
    doWhen(1)
    doWhen("Test")
    doWhen(11L)
    doWhen(2)
}

// 어떠한 변수도 받을 수 있음
fun doWhen(a: Any) {
    when (a) {
        1 -> println("정수 1입니다.")
        "Test" -> println("코틀린 입니다.")
        is Long -> println("Long 타입 입니다.")
        !is String -> println("String 타입이 아닙니다.")
        else -> println("어떤 조건도 만족하지 않습니다.")
    }

    // when 을 변수에 담을 수 있음
    val result = when (a) {
        1 -> println("22 정수 1입니다.")
        "Test" -> println("22 코틀린 입니다.")
        is Long -> println("22 Long 타입 입니다.")
        !is String -> println("22 String 타입이 아닙니다.")
        else -> println("22 어떤 조건도 만족하지 않습니다.")
    }

    println(result)
}
