package STEP18

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    /*
    https://mike7chu.github.io/collection-1-class-Kotlin/

    컬렉션	    불변형	        가변형
    List	    listOf	        mutableListOf, arrayListOf
    Set	setOf	mutableSetOf,   hashSetOf, linkedSetOf, sortedSetOf
    Map	mapOf	mutableMapOf,   hashMapOf, linkedMapOf, sortedMapOf
    * */

    val a = listOf("사과", "딸기", "배")
    println(a[1])

    for(fruit in a)
    {
        print("${fruit}:")
    }

    println()

    val b = mutableListOf(6, 3, 1)
    println(b)

    b.add(4)
    println(b)

    b.add(2, 8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)


}

