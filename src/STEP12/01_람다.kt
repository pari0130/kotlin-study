package STEP12

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {

    // 고차 함수 형태로 넘기려면 ::a 형태로 콜론 2개를 붙힌다.
    b(::a)

    // 람다 식의 고차 함수
    // str 뒤에 변수의 타입을 적지 않아도 되는 이유는 (String) 로 받았기 때문에 자동 타입 추론이 가능하기 때문
    val c : (String) -> Unit = { str -> println("$str 람다함수")}
    b(c)
}

private fun a (str : String){
    println("$str 함수 a")
}

// a의 파라미터가 String 이므로 String 타입 전달
private fun b (function : (String) -> Unit){
    function("b가 호출한")
}
