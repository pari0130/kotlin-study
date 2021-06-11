package STEP24

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    val a = mutableMapOf("레드밸벳" to "음파음파", "트와이스" to "fancy", "itzy" to "icy")

    for (entry in a){
        println("${entry.key} : ${entry.value}")
    }

    a.put("오마이걸", "번지")
    println(a)

    a.remove("itzy")
    println(a)

    println("레드밸벳")
}
