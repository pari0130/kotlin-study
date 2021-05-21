package STEP14

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {

    // 서로다른 인스턴스를 생성했지만 같은 클래스 내에서 companion object 라는 값을 공용으로 사용했기 때문에 카운트가 같이 증가됨
    val a = FoodPoll("짜장")
    val b = FoodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("총계 : ${FoodPoll.total}")
}

private class FoodPoll(val name: String) {
    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        total++
        count++
    }
}

