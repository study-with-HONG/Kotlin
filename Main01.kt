import java.util.*

fun main(args:Array<String>){ // python + Javascript
    //// 입출력
//    print("input : ")
//    val input = readLine() // scanner
//    println("You input : " + input)
//    println("You input : $input")

//    val read = Scanner(System.`in`)
//    print("number : ")
//    val number = read.nextInt()
//    println("number : $number")

    //// 변수 variable , 값 value
    // String str = "abc";           변수 -> java
    // final String name = "홍길동";  상수 -> java
//    var str:String = "abc"       // 변수
//    val name:String = "홍길동"    // 상수
//    str = "def"
//    // name = "성춘향" 상수라 변경 불가
//    println("str : $str")
//    println(str + name)

//    var a = 1
//    val str1 = "a = $a"
//    val str2 = "a = ${a + 1}"
//    println("str1 : \"$str1\", str2 : \"$str2\"")

//    val num1 = 5; // Int로 추론
//    val num2 = 3
//    val num3:Int = num1 + num2
//    println("num1 + num2 = $num3")

    //// 문자열 비교 equals
//    var str3:String = "hello"
//    var str4 = "hell"
//    str4 = str4 + "o"
//    println("${str3 == str4}") // true, equals 자동호출
//    println("${str3 === str4}") // false, 값을 비교

//    val a:Int = 128
//    val b = a
//    println(a == b)
//    println(a === b) // true, 같은 객체
//
//    val c:Int? = a
//    val d:Int? = a // ?가 들어가면서 wrapper가 됐음
//    println(c == d) // true, 같은 값 비교
//    println(c === d) // false, 다른 객체

    //// ?(null일 수 있음 -> ?없는 변수에 null을 넣으면 오류), !!(null이 아니다)
//    var e:Int? = null
//    var f:Int? = 10
//    var g:Int = f!! // 강제, 강조

//    var str5:String? = "Hello Kotlin"
//    str5 = null

    //// 자료형 크기
//    println("Byte min:" + Byte.MIN_VALUE + " max:" + Byte.MAX_VALUE)
//    println("Short min:" + Short.MIN_VALUE + " max:" + Short.MAX_VALUE)
//    println("Int min:" + Int.MIN_VALUE + " max:" + Int.MAX_VALUE)

    //// 자료형 변환
//    var h:Int = 12
//    val i:Boolean = true
//    var j:Double = 12.12
//    // java -> Integer.toString(a) / a + ""
//    val k = h.toString()
//    println(k)
//    // java -> parseInt()
//    var l:Int = k.toInt()
//    println(l + 1)
}