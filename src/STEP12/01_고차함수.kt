package STEP12

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {

    // 고차 함수 형태로 넘기려면 ::a 형태로 콜론 2개를 붙힌다.
    b(::a)
}

private fun a (str : String){
    println("$str 함수 a")
}

// a의 파라미터가 String 이므로 String 타입 전달
private fun b (function : (String) -> Unit){
    function("b가 호출한")
}
