fun main(args: Array<String>) {
    //// try catch finally
//    val a = 10
//    val b = 0
//    var c:Int
//
//    try {
//        c = a/b
//    }catch (e:ArithmeticException){
//        println(e.message)
//    }catch (e:Exception){
//        println(e.message)
//    }finally {
//        println("finally")
//    }

//     var money = 1000
//
//     try {
//         money -= 200
//         checkAmount(money)
//     }catch (e:Exception){
//         println(e.message)
//     }
//     println("뿅")
}

fun checkAmount(money:Int){
    if(money < 1000){
        throw Exception("잔고가 ${money}으로 1000이하 입니다")
    } else{
        println("잔고가 ${money}만큼 있습니다")
    }
}
