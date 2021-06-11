package STEP25

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {

    val numbers = listOf(-3, 7, 2, -10, 5)

    // flatmap 개별 아이템에 접근하여 값을 추가하거나 연산을 수행
    println(numbers.flatMap { listOf(it * 10, it + 10) })

    // index 에 접근하여 값이 없을 경우 대체값을 입력
    println(numbers.getOrElse(1){50}) // 7
    println(numbers.getOrElse(10){50}) // 50

    // names 와 numbers 를 묶어서 처리
    val names = listOf("a", "b", "c", "d")
    println(names zip numbers) // flatmap 개별 아이템에 접근하여 값을 추가하거나 연산을 수행
}