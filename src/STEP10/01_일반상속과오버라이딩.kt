package STEP10

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    val t = Tiger()

    t.eat()
}

// class 및 함수에 open 을 붙혀서 재구현이 가능하도록 변경
open class Animal{
    open fun eat(){
        println("음식을 먹습니다.")
    }
}

class Tiger : Animal(){
    override fun eat(){
        println("고기를 먹습니다")
    }
}
