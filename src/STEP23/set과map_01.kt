package STEP23

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

/*
* Data clas 특징
* 내용의 동일성 equals 를 자동 생성
* 고유한 hashcode
* toString 생성
* 객체 복사 copy 자동 생성
* 속성을 반환하는 컴포넌트 반환 가능
*/
fun main() {
    val a = General("보영", 212)

    println(a == General("보영", 212))
    println(a.hashCode())
    println(a)

    // data class 의 경우 객체를 새로 생성하더라도 동일한 객체라는것을 확인 가능함
    val b = Data("루다", 306)

    println(b == Data("루다", 306))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("아린"))
    println(b.copy(id=618))
}

class General(val name : String, val id : Int)

data class Data(val name : String, val id : Int)

