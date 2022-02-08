package STEP22

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

// 외부클래스 이름.내부클래스 이름으로 사용
fun main() {
    Outer.Nested().introduce()

    val outer = Outer()
    val inner = outer.Inner()

    inner.introduceOuter()
    inner.introduceInner()

    outer.text = "Changed Outer Class"
    inner.introduceOuter()
}

class Outer {
    var text = "Outer class"

    class Nested {
        fun introduce(){
            println("Nested Class")
        }
    }

    inner class Inner {
        var text = "Inner Class"

        fun introduceInner(){
            println(text)
        }

        fun introduceOuter(){
            println(this@Outer.text)
        }
    }
}