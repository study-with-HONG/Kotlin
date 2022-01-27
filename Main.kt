fun main(args: Array<String>) {
    //// if
//    var num:Int = 85
//    val str = if(num > 90){
//        "Good"
//    } else{"Soso"}
//    println(str) // 방법1

//    var str2:String = ""
//    if(num > 90){
//        str2 = "Good"
//    } else{str2 = "Soso"}
//    println(str2) // 방법2

    //// 삼항연산자 비슷 -> kotlin에는 삼항연산자 X
//    val str3 = if(num > 80) "Good" else "Soso"
//    println(str3)

//    val why = 1
//    if(why is Int){
//        println("숫자입니다")
//    } else{
//        println("숫자가 아닙니다")
//    }

    //// 논리 연산자
//    if(why > 0 && why < 10){println("why는 0보다 크고, 10보다 작다")}
//    if((why > 0) and (why < 10)){println("why는 0보다 크고, 10보다 작다")} // 문자랑 영어 둘 다 가능

    //// 둘 중에 누가 더 큰가
//    val a = 15
//    val b = 30
//    val max = if(a>b) a else b
//    println(max)

    //// 학점 계산기
//    val score = 70.5
//    val grade = if(score >= 90){"A"}
//           else if((score >= 80) && (score < 90)){"B"} // score in 80.0..89.9
//           else if((score >= 70) && (score < 80)){"C"} // score in 70.0..79.9
//           else{"D"}
//    println("score : $score, grade : $grade")

    //// switch
//    val num = 2
//    val str = when(num){
//        1 -> "ABC"
//        2, 3 -> "DEF"
//        else -> "GHI"
//    }
//    println(str)

//    val num2 = 5.5
//    var str2:Char = 'Z'
//
//    when(num2){
//        in 8.0..10.0 -> str2 = 'A'  // num2 > 8.8
//        in 5.0..7.9 -> str2 = 'B'   // num2 in 5.0..7.9
//        in 3.0..4.9 -> str2 = 'C'   // num2 in 3.0..4.9
//        !in 3.0..10.0 -> str2 = 'F' // num2 < 3
//    }
//    println(str2)

    //// foreach
//    val arr = arrayOf(1, 2, 3)
//    for(a in arr){  // arr에 있는 요소 출력
//        print("$a ")
//    }
//    println()
//
//    for(b in 1 until 15){ // 1에서 14까지 출력
//        print("$b ")
//    }
//    println()
//
//    for(c in 30 downTo 20){ // 30에서 20까지 출력
//        print("$c ")
//    }
//    println()
//
//    for(d in 40..45){ // 40에서 45까지 출력
//        print("$d ")
//    }
//    println()
//
//    for(e in 50 until 70 step 5){ // 50에서 69까지 5증가
//        print("$e ")
//    }
//    println()

    //// while, do while
//    var num:Int = 0
//    while (num < 5){
//        println(num)
//        num++
//    }
//
//    var num2 = 10
//    do{
//        println(num2)
//        num2++
//    }while (num2 < 15)

    // continue, break
    for(i in 1..5){
        if(i == 3) continue
        println(i)
    }

    for(j in 10..15){
        if(j == 13) break
        println(j)
    }
}