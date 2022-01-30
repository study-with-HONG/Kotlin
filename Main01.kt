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

    //// 표현식 expression
//    30 + 30 - 10 // 오류X

    //// 변수 variable , 값 value
    // java 변수 -> String str = "abc";
    // java 상수 -> final String name = "홍길동";
//    var str:String = "abc"       // 변수
//    val name:String = "홍길동"    // 상수
//    str = "def"
    // name = "성춘향" 상수라 변경 불가
//    println("str : $str")
//    println(str + name)

//    var a = 1
//    val str1 = "a = $a"
//    val str2 = "a = ${a + 1}"
//    println("str1 : \"$str1\", str2 : \"$str2\"")

//    val num1 = 5; // 자료형 지정은 안했지만 자동으로 Int라고 인식.
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

    //// 자료형
    // 정수 타입 : 저장 가능한 범위
//    println("Byte min:" + Byte.MIN_VALUE + " max:" + Byte.MAX_VALUE)
//    println("Short min:" + Short.MIN_VALUE + " max:" + Short.MAX_VALUE)
//    println("Int min:" + Int.MIN_VALUE + " max:" + Int.MAX_VALUE)
//    println("Long min:" + Long.MIN_VALUE + " max:" + Long.MAX_VALUE)
//    val ii:Int = 1_000_000 // 알아보기 쉽게 _로 자리수를 나타낼 수 있음

    // 실수 타입 Float, Double : 소수점의 정밀도
//    val ff:Float = 10.0f // float는 뒤에 f, F를 붙여서 선언

    // 문자 타입
//   var ch:Char = '\uAC00' // 유니코드
//    println(ch)

    //// typealias 타입에 별명을 만들어 줌
//    val iii:Pink = 10
//    println(iii)

    //// 자료형 변환
//    var h:Int = 12
//    val i:Boolean = true
//    var j:Double = 12.12
    // java -> Integer.toString(a) / a + ""
//    val k = h.toString()
//    println(k)
    // java -> parseInt()
//    var l:Int = k.toInt()
//    println(l + 1)

    //// 논리 연산자
//    val m = 10
//    val n = 30
//
//    val bb:Boolean = (m > n) && (m == 10)
//    val bb2:Boolean = (m < n) and (m == 10)
//    println("$bb  $bb2") // 문자랑 영어 둘 다 가능
}

//// typealias
typealias Pink = Int
