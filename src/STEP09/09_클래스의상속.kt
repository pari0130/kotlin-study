package STEP09

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    val a = Animal("별이", 5, "개")
    val b = Dog("별이", 5)

    a.intro()
    b.intro()

    b.bark()

    var c = Cat("루이", 1)
    c.intro()
    c.meow()
}

// open 은 클래스가 상속 될수 있도록 해주는 예약어
open class Animal(var name: String, var age: Int, var type: String) {
    fun intro() {
        println("저는 $type $name 이고, $age 살 입니다.")
    }
}

// 아규먼트 뒤 : 에 상속할 상위 클래스 `09`.Animal 추가 / 아규먼츠는 모두 적어야 함
class Dog(name: String, age: Int) : Animal(name, age, "개") {
    fun bark() {
        println("멍멍")
    }
}

class Cat(name: String, age: Int) : Animal(name, age, "고양이") {
    fun meow() {
        println("야옹 야옹")
    }
}
