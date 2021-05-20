import kotlin.math.PI
import kotlin.math.abs

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    var a = Person2("박보영", 1990)
    var b = Person2("장원영", 2004)
    var c = Person2("조동휘", 1990)

    // 보조 생성자를 통해 초기값을 세팅할 수 있음
    var a1 = Person2("박보영")
    var b1 = Person2("장원영")
    var c1 = Person2("조동휘")
}

class Person2(var name: String, var birDay: Int) {
    init {
        println("${this.birDay}년생 ${this.name} 님이 생성되었습니다.")
    }

    // 기본 생성자가 필요로 하는 파라미터를 this 로 넣어야 함
    constructor(name: String) : this(name, 1997) {
        println("보조 생성자가 사용되었습니다.")
    }
}
