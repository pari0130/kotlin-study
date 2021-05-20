package STEP10

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    val r = Rabbit()
    r.eat()
    r.sniff()
}

// 추상 함수를 사용하여 실제 구현채가 rabbit 클래스에서 동작 되도록 함
abstract class Animal1{
    abstract fun eat()
    fun sniff(){
        println("킁킁")
    }
}

class Rabbit : Animal1(){
    override fun eat(){
        println("당근을 먹습니다.")
    }
}
