package STEP10

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {

    var d = Dog()
    d.run()
    d.eat()

}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다.")
    }
}

// 두개의 기능을 활용 할때 인터페이스를 오버라이딩 하여 사용
class Dog : Runner, Eater {
    override fun run() {
        println("우다다다 뜁니다.")
    }

    override fun eat() {
        println("허겁지겁 먹습니다.")
    }
}
