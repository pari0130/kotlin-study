package STEP21

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30," 학교")

    // 파라미터 할당 방법
    deliveryItem("선물", destination = "친구집")
}

// default param
fun deliveryItem(name : String, count: Int = 1, destination : String = "집"){
    println("${name}, ${count} 개를 ${destination}에 배달하였습니다.")
}

