package STEP14

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {

    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()

    println(Counter.count)

}

// 공용으로 사용하기 위한 싱글톤 과 비슷한 개념
private object Counter {
    var count = 0

    fun countUp(){
        count ++
    }

    fun clear(){
        count = 0
    }
}
