package STEP13

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

// 파라미터가 없는 람다함수
// 파라미터가 여러개인 람다함수

fun main() {

    var price = 5000

    // apply 인스턴스를 생성한 후 변수에 담기전에 초기화 과정을 수행할때 사용
    var a = Book("디모의 코틀린", 10000).apply {
        name = "[초특가] $name"
        discount()
    }

    println(a.name)

    // 마지막에 결과값을 반환하는 특징, 함수나 속성을 스코프 내에서 사용해야 할때 사용
    a.run{
        // 아래는 가격이 5000원이 나오는데 이러한 이유는 변수로 넘겨받은 price 보다 상단 var 변수에 담긴 5000원을 우선시 하기 때문임
        println("상품명 : $name, 가격 : $price")
    }

    // with 은 참조연산자 대신 파라미터로 받는다는 차이 뿐

    // 위 파라미터 변수 10000에 대해서 처리를 하려면 let, it 을 써야함
    a.let{
        println("상품명 : ${it.name}, 가격 : ${it.price}")
    }
}

private class Book(var name : String, var price : Int){
    fun discount(){
        price -= 2000
    }
}
