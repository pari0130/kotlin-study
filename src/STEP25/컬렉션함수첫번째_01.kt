package STEP25

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    val nameList = listOf("박수영", "김지수", "김다현", "신유나", "김지우")

    nameList.forEach{ print(it + " ")}
    println()

    println(nameList.filter { it.startsWith("김") })

    // 아래는 boolean return

    // 특정 문자를 매핑 하여 출력
    println(nameList.map{"이름 : " + it})

    println(nameList.any{ it == "김지현"})
    println(nameList.all{ it.length == 3})
    println(nameList.none{ it.startsWith("이")})
    println(nameList.first{ it.startsWith("김")})
    println(nameList.last{ it.startsWith("김")})
    println(nameList.count{ it.contains("지")})
}