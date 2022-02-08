fun main(args: Array<String>) {
//    val r = sum(3, 7)
//    println("sum : $r")

//    val m = max(7, 5)
//    println("max : $m")

    //// 기본인수
//    mail("정유미", "dbal@naver.com")
//    mail("최우식")

//    sum2()
//    sum2(30)
//    sum2(50, 50)

//    sum3(100, 100, 100)
//    sum3(50, z = 50) // z=을 안하면 y값으로 인식함
//    sum3(z = 10)

    //// 가변인자
//     arrPrint(1, 2, 3, 4, 5)
//     arrPrint(10, 20, 30)
    
    //// Unit 반환값이 없는 타입
//     aaUnit(15)
}

//fun sum(a:Int, b:Int) = a + b // 람다식 함수
fun sum(a:Int, b:Int):Int{
    var sum = a + b
    return sum
}

//fun max(a: Int, b: Int) = if(a>b) a else b
fun max(a: Int, b: Int):Int{
    return if(a>b) a else b
}

//// 기본인수, default parameters
fun mail(name:String, email:String = "nobody"){
    val prt = "${name}님의 이메일은 ${email}입니다"
    println(prt)
}

fun sum2(x:Int = 10, y:Int = 50){
    println(x + y)
}

fun sum3(x:Int = 10, y:Int = 10, z:Int){
    println(x + y + z)
}

//// 가변인자
/*  일반 변수와 같이 사용할 수 있지만 마지막에 배치해야 함.
    fun myFunc(a:Char, vararg b:Int):Int
    fun myFunc2(vararg c:Int, d:Char):Int 오류
    fun myFunc3(vararg e:Int, f = 'F'):Int 가변인수가 먼저 올 때는 일반변수에 기본인수 대입
*/
fun arrPrint(vararg arr:Int){
    for(i in arr){
        print("$i ")
    }
    println()
}

//// Unit 생략가능
fun aaUnit(xx:Int):Unit{
    print(xx * 0.5 + 30)
}
