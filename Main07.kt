fun main(args: Array<String>) {
    // 예제 1
//    val pro = arrayOf(Product("Monitor", 200000),
//                      Product("Mouse", 50000),
//                      Product("desktop", 650000),
//                      Product("key board", 100000))
//    pro.sortBy { it.price } // 가격순으로 정렬
//    pro.forEach { println("${it.name}, ${it.price}") }

    // 예제 2
//    var ps = Name("우식", "최")
//    println(ps.fullName())
//    ps.firstName = "다미"
//    println(ps.fullName())

    // 예제 3
//    val mem1 = Member("abc123", "password123", "happy")
//    println(mem1.id)
//
//    val mem2 = Member("qazqaz", "a1b2c3", "day")
//    println(mem2.memInformation())
}
data class Product(val name:String, val price:Int) // data 생략 가능

class Name{
    var firstName:String
    var lastName:String

    // 코드 -> 생성 -> 보조 생성자
    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }
    fun fullName():String{
        return "$lastName $firstName"
    }
}

class Member(val id:String, var pwd:String, var name:String){
    fun memInformation():String{
        return "id:$id, password:$pwd, name:$name"
    }
}
