package STEP02

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN
// 형변환과 배열

fun main() {

    // 형변환을 위해서는 앞에 to 를 붙히면 다양한 변환 가능 함수가 표시된다.
    val a: Int = 111
    val b: Long = a.toLong()

    // 배열은 Array<T> 형태
    val intArr = arrayOf(1,2,3,4,5) // 자동 추론으로 Array<Int> 을 생략해도 코틀린에서 입력 됨
    val intArr2: Array<Int> = arrayOf(1,5,3,4,5) // 자동 추론으로
    var nullArr = arrayOfNulls<Int>(5) // <Int> 의 경우 제너릭

    intArr[2] = 8
    println(intArr[2]) // 8
    println(intArr2[2]) // 5



}
