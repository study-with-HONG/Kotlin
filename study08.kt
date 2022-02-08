fun main(args: Array<String>) {
    //// 접근제한자
//    var mem = Member("분홍", "연", 25)
//    // mem.age = mem.age + 1  private라 접근 불가
//    println(mem.toString())
//
//    val stu = Student()
//    stu.method()
//    // stu.protectVar = 25 접근불가
//    stu.interVar = 25   // 접근가능

    //// 선언위치
//    val dog = Dog("푸들", "black", "뽀삐")
//    println(dog.toString())

    //// 기본 생성자, 보조 생성자
//    val cat1 = Cat("yellow", "white", "노랑이")
//    println(cat1.toString())
//    val cat2 = Cat("brown", "yellow")
}

/// 접근제한자
open class Member{ // open을 붙여야 상속가능
    var fistName:String = ""
    var lastName:String = ""
    private var age:Int = 10            // 같은 클래스 안에서만
    protected var protectVar:Int = 11 // 같은 + 자식 클래스 내에서만
    internal var interVar:Int = 12   // 같은 모듈 내에서만

    constructor()
    constructor(fistName: String, lastName: String, age:Int) {
        this.fistName = fistName
        this.lastName = lastName
        this.age = age
    }
    private fun privateFunc(){
        println("Person privateFunc()")
    }
    override fun toString(): String {
        return "Person(fistName='$fistName', lastName='$lastName', age=$age)"
    }
}
class Student:Member(){
    fun method(){
        protectVar = 20 // 사용가능
        println("protectVar $protectVar")

        interVar = 21 // 사용가능
        println("interVar $interVar")
    }
}
//// 선언위치
class Dog(var species:String, var color:String, var name:String){ // 외부 선언
    // 내부 선언
//    var species:String
//    var color:String
//    var name:String
    var age:Int = 1

    // 외부 초기화 했을 때 constructor 만들면 오류
    /*constructor(species: String, color: String, name: String) {
        this.species = species
        this.color = color
        this.name = name
    }*/
    override fun toString(): String {
        return "Dog(species='$species', color='$color', name='$name', age=$age)"
    }
}
//// 생성자
class Cat(val color1:String, val color2:String, val name:String){ // 기본 생성자
    constructor(color1: String, color2: String):this(color1, color2, "나비") { // 보조 생성자
        println("${name}의 두 가지 색깔 $color1 $color2")
    }
    override fun toString(): String {
        return "Cat(color1='$color1', color2='$color2', name='$name')"
    }
}
