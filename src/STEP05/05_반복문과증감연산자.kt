package STEP05

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main2() {

    // 조건형 반복문
    var a = 0
    var b = 0
    var c = 0
    while (a < 5) {
        println(a++)
    }

    while (b < 5) {
        println(++b)
    }

    do {
        println("c 는 ? " + c++)
    } while (c < 5)

    val a1 = 1
    val a2 = 9
    // 0~9 까지 반복 되도록 처리함
    for(i in a1..a2){
        println("i 값은 ? : " + i)
    }

    // 3씩 증가되며 출력
    for(i in 0..9 step 3){
        println("i 값은 ? : " + i)
    }

    // downTo 를 감소, step 을 붙히면 증가 되며 출력이 가능
    for(i in 9 downTo 0){
        println(i)
    }

    for(i in 'a'..'e'){
        println(i)
    }
}

fun main() {
    cloneTest()
}


internal class Point(var x: Int, var y: Int) : Cloneable {
    override fun toString(): String {
        return "x : $x, y : $y"
    }

    public override fun clone(): Any {
        var obj: Any? = null
        try {
            obj = super.clone()
        } catch (e: CloneNotSupportedException) {
        }
        return obj!!
    }
}

fun cloneTest() {
    val original = Point(3, 5)
    val copy = original.clone() as Point
    println(original)
    println(copy)
}

