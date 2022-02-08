package STEP25

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    data class Person(val name: String, val birthyear : Int)

    val personList = listOf(
        Person("유나", 1992),
        Person("조이", 1996),
        Person("츄", 1999),
        Person("유나나나", 2003))

    // map 으로 변경
    println(personList.associateBy { it.birthyear })
    println()

    // 특정 값을 키로 지정하여 해당값 끼리 묶는 map
    println(personList.groupBy { it.name})
    println()

    // 조건에 따라 ture false 로 두 컬렉션 리스트로 변환
    val (over98, under98) = personList.partition { it.birthyear > 1998 }
    println(over98)
    println(under98)
}