package STEP19

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    val test1 = "Test.Kotlin.String"

    println(test1.length)
    println(test1.toLowerCase())
    println(test1.toUpperCase())

    val test2 = test1.split(".")
    println(test2)

    println(test2.joinToString())
    println(test2.joinToString("-"))
    println(test1.substring(5..10)) // 5~10 까지만 출력

    val nullString : String? = null
    val emptyString = ""
    val blankString = " "
    val normalString = "A"

    println(nullString.isNullOrEmpty()) // true
    println(emptyString.isNullOrEmpty()) // true
    println(blankString.isNullOrEmpty()) // false
    println(normalString.isNullOrEmpty()) // false

    println()

    println(nullString.isNullOrBlank()) // true
    println(emptyString.isNullOrBlank()) // true
    println(blankString.isNullOrBlank()) // true
    println(normalString.isNullOrBlank()) // false

}
