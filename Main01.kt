fun main(args:Array<String>){
    //// 입출력
//    print("문장 입력 : ")
//    val input = readLine()        // scanner1
//    println("input : " + input)
//    println("input : $input")

//    val read = Scanner(System.`in`) // scanner2
//    print("숫자 입력 : ")
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

//    val num1 = 5; // 자료형 지정은 안했지만 숫자가 들어가서 Int라고 인식함.
//    val num2 = 3
//    val num3:Int = num1 + num2
//    println("num1 + num2 = $num3")

    //// 문자열 비교 equals(java), ==, ===
//    var str3:String = "딸기쿠키"
//    var str4 = "딸기"
//    str4 = str4 + "쿠키"
//    println("${str3 == str4}")  // true, equals 자동호출해서 값 비교
//    println("${str3 === str4}") // false, 주소 비교

//    val a:Int = 128
//    val b = a
//    println(a == b)  // true
//    println(a === b) // true, 같은 객체
//    val c:Int? = a
//    val d:Int? = a // ?가 들어가면서 wrapper가 됐음
//    println(c == d) // true, 같은 값 비교
//    println(c === d) // 127은 true, 그 이상은 false

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
