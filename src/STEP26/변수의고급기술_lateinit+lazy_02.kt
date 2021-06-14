package STEP26

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN

fun main() {
    val a = LateInitSample()

    println(a.getLateInitText())
    a.text = "새로할당한값"
    println(a.getLateInitText())
}

class LateInitSample {
    lateinit var text : String

    fun getLateInitText() : String {
        if(::text.isInitialized){
            return text
        }else{
            return "기본값"
        }
    }
}