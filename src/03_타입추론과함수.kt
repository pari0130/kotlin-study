import kotlin.math.PI
import kotlin.math.abs

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    // 타입 추론으로 자동 int Long 으로 변환
    val a = 1234
    val b = 1234L

    println(add(4, 5, 6))
    println(add2(1, 2, 3))
}


// 함수 () 후 : 타입은 반환 자료 형태 임
// 아래 형태는 Int 형 반환 구조
fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

// 단일 타입의 함수에서는 반환형을 생략 가능함
fun add2(a: Int, b: Int, c: Int) = a + b + c
