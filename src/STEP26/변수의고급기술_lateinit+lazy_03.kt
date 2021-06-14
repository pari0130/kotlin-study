package STEP26

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    /*
    코드를 시작합니다
    초기화를 합니다
    7
    7
    * */
    val number : Int by lazy{
        println("초기화를 합니다")
        7
    }

    println("코드를 시작합니다")
    println(number)
    println(number)
}
