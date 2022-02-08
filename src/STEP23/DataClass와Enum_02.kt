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
    val list = listOf(Data("보영", 212), Data("루다", 306), Data("아린", 618))

    for((a,b) in list ){
        println("${a}, ${b}")
    }

}

class General2(val name : String, val id : Int)

data class Data2(val name : String, val id : Int)

