package STEP01

import java.text.SimpleDateFormat
import java.time.Instant
import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

// https://youtu.be/ZMOsbFCEeCY?list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN
// 변수와 자료형

fun main() {
    val a: Int = 12345
    val b: Int? = null // 변수 선언 문 뒤에 ? 물음표는 nullable 의미

    println(a)

    val c: Boolean = true
    val d: String = "test"

    /*
    var : 선언 후 변경 가능 like let
    val : 선언 후 변경 불가능 like const
    * */

    var map = HashMap<String, Any>()
    map["1"] = "2"
    map["2"] = "3"

    println(map.get("3"))

    val test = "1"
    var test2 = "2"
    (test.isNotEmpty() || test2.isNotEmpty())?.let {
        println("test : $test")
        println("test : $test2")
    }

    println(" 10 11 1111 ".replace(" ",""))

    println(convertDateTime("1622517367", 3, "ko"))
}

fun convertDateTime(dt: String, timeZoneHour: Int? = 9, lang: String? = "ko") : String {

    val dateTimeFormatKO = "yyyy-MM-dd HH:mm:ss"
    val dateTimeFormatEN = "dd/MM/yyyy HH:mm:ss"

    val format = if (lang?.toLowerCase().equals("en")) {
        dateTimeFormatEN
    } else {
        dateTimeFormatKO
    }

    val zoneOffset = timeZoneHour?.let {
        ZoneOffset.ofHours(timeZoneHour)
    } ?: run {
        ZoneOffset.ofHours(9)
    }

    return DateTimeFormatter.ofPattern(format).format(
        ZonedDateTime.ofInstant(
            Instant.ofEpochSecond(dt.toLong()),
            zoneOffset
        )
    )
}
