var golbalVar = 1 // 전역변수

fun main(args: Array<String>) {
//    val s = sum(10, 20)
//    println(s)
//    val t = text("Hello!", "봉쥬르!")
//    println(t)

    //// 함수 참조
//    val fs = funParam(5, 6, ::sum)
//    println(fs)

//    hello(::text)
//    hello({a, b -> text(a, b)})

    //// 함수를 변수에 할당
//    val lambda = ::sum
//    println(lambda(5, 4))

    //// 전역변수, 지역변수
//    fun localFuc(){
//        golbalVar = 10
//    }
//    localFuc() // golbalVar값이 10으로 바뀜
//    println(golbalVar)
    
    //// 오버로딩 overLoading - 함수 이름이 같지만 매개변수타입이나 갯수가 다름
    oLoading(1)
    oLoading2("Hi")
    oLoading3(11, "Hello")
}

fun sum(a:Int, b:Int) = a + b
fun text(a:String, b:String) = "Hi! $a $b"

//// 함수 참조
fun funParam(a:Int, b:Int, c:(Int, Int) -> Int):Int{
    return c(a, b)
}

fun hello(tt:(String, String) -> String){ // String 2개 받아서 String으로 반환
    println(tt("안녕", "사와디캅"))
}

//// 오버로딩
fun oLoading(x:Int){
    println("oLoading(x:Int) 호출"
}
fun oLoading2(y:String){
    println("oLoading2(y:String) 호출"
}
fun oLoading3(x:Int, y:String){
    println("oLoading3(x:Int, y:String) 호출"
}
