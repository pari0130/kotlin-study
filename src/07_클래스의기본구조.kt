import kotlin.math.PI
import kotlin.math.abs

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    var a = Person("박보영", 1990)
    var b = Person("장원영", 2004)

    a.intro()
    b.intro()
}

class Person(var name: String, val brsDay: Int) {
    fun intro() {
        println("안녕하세요, ${brsDay}년생 ${name} 입니다.")
    }
}
