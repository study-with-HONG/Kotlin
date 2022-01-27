fun main(args: Array<String>) {
//    val products = arrayOf(
//        Product("Mouse", 3000.0),
//        Product("Monitor", 250000.0),
//        Product("Tablet", 180000.0),
//        Product("Keyboard", 5500.0)
//    )
//    products.sortBy { it.price } // 가격순으로 정렬
//    products.forEach { println("${it.name}, ${it.price}") }

//    var ps = Person("우식", "최", 30)
//    println(ps.fullName())
//    ps.firstName = "유미"
//    println(ps.fullName())

//    val hu = Human("abc123", "1234", "뽀삐")
//    println(hu.id)
//    hu.pwd = "0147"
//    println(hu.pwd)
//
//    val hu2 = Human("asdf12", "qwer", "누리")
//    println(hu2.id)
//    println(hu2.fullInform())

//    val b = Bird()
//    b.color = "yellow"
//    b.birdColor()
//    b.birdName()
}

//// DTO, VO
data class Product(val name:String, val price:Double) // data는 생략 가능

class Person{
    var firstName:String
    var lastName:String
    var age:Int

    constructor(firstName: String, lastName: String, age: Int) {
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }
    fun fullName(): String {
        return "$lastName$firstName ${age}살"
    }
}

data class Human(val id:String, var pwd:String, var name:String){
    fun fullInform():String{
        return "$id $pwd $name"
    }
}

class Bird{
    var name:String = "참새"
    var wing:Int = 2
    var color:String = "brown"

    fun birdColor() = println("bird color : $color")
    fun birdName() = println("bird name : $name")
}
