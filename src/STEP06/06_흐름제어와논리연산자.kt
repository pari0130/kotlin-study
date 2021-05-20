package STEP06

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    for (i in 1..10) {
        if (i == 3) continue
        println(i)
    }

    // 고전형태에서는 조건을 체크 후 break 를 수행
    for (i in 1..10) {
        for (j in 1..10) {
            if (i == 1 && j == 2) {
                println("test")
                break
            }
        }
    }

    // 코틀린에서는 label 을 추가하여 사용
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i == 1 && j == 2) break@loop
            println("i : $i, j : $j")
        }
    }

    println(true && false)
    println(true || false)
    println(!true)
    println(!false)

    var a = 6
    var b = 7

    println(a > 5 && b > 5)
}
