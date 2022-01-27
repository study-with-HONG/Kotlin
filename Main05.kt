fun main(args: Array<String>) {
//    val r = sum(3, 7)
//    println("sum : $r")

//    val m = max(7, 5)
//    println("max : $m")

    //// default parameters
//    mail("정유미", "dbal@naver.com")
//    mail("최우식")

//    add()
//    add(30)
//    add(50, 50)

//    add2(100, 100, 100)
//    add2(50, z = 50) // z=을 안하면 y값으로 인식함
//    add2(z = 10)

    //// 가변인자
//     arrPrint(1, 2, 3, 4, 5)
//     arrPrint(10, 20, 30)
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

fun add(x:Int = 10, y:Int = 50){
    println(x + y)
}

fun add2(x:Int = 10, y:Int = 10, z:Int){
    println(x + y + z)
}

//// 가변인자
fun arrPrint(vararg arr:Int){
    for(i in arr){
        print("$i ")
    }
    println()
}
