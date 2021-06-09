package STEP21

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    // 개수가 지정되지 않은 파라미터, 가장 마지막에 써야함
    sum(1,2,3,4)
}

// vararg 로 전달받은 변수는 for 문에서 참조가 가능함
fun sum(vararg numbers: Int){
    var sum = 0

    for(n in numbers){
        sum += n
    }

    print(sum)
}


