fun main(args: Array<String>) {
    //// 오버라이드 1
//    val hn = HumanName() // 내부 선언에서는 오류
//    println(hn.fullName)
//    var hn2 = HumanName("하늘", "연") // 외부 선언, 내부 선언 둘 다 가능
//    hn2.lastName = "청"
//    println(hn2.fullName)
//
//    val child = Child("노랑", "진", "서울")
//    println(child.fullName)

    //// 오버라이드 2
//     val c = Crow("까마귀", "black", 50, 5)
//     println(c.toString())
//     println(c.allData())

    //// 오버로드
//     val cal = Calc()
//     println(cal.add(3, 4))
//     println(cal.add(3.1, 4.1))
//     println(cal.add(3, 4, 5))
//     println(cal.add(3.5, 4.5, 5.5))
}
//// 오버라이드 1
open class HumanName(var firstName:String = "분홍", var lastName:String = "진"){
    /*class HumanName{
        var firstName:String
        var lastName:String

        constructor(firstName: String, lastName: String) {
            this.firstName = firstName
            this.lastName = lastName
        }*/
    open val fullName:String
        get() = "$lastName$firstName"
}
// 자식 class : 부모에 있는 변수는 선언할 때 var, val 생략
class Child(firstName: String, lastName: String, var address:String):HumanName(firstName, lastName){
    // 코드 -> 메소드 재정의 : override 역시 부모에 open을 작성해야 함
    override val fullName: String
        // 출력하는 2가지 방법
//        get() = super.fullName + " $address"
        get() = "$lastName$firstName $address"
}

//// 오버라이드 2
open class Bird(val name:String, var color:String, var size:Int){
    fun birdColor() = println("${name}의 색깔은 ${color}")

    override fun toString(): String {
        return "Bird(name='$name', color='$color', size=$size)"
    }
    open fun allData(){
        print("$name $color ")
    }
}
class Sparrow(name:String, color:String, size:Int):Bird(name, color, size){
    fun birdSound() = println("짹짹")
}
class Crow:Bird{
    var vol:Int = 0

    constructor(name: String, color: String, size: Int, vol: Int) : super(name, color, size) {
        this.vol = vol
    }
    override fun toString(): String {
        return super.toString() + ", vol=$vol"
    }
    override fun allData() {
        super.allData()
        println("울음소리 크기:$vol")
    }
}

//// 오버로드
class Calc{
    fun add(x:Int, y:Int):Int = x + y
    fun add(x:Double, y:Double):Double = x + y
    fun add(x:Int, y:Int, z : Int):Int = x + y + z
    fun add(x:Double, y:Double, z:Double):Double = x + y + z
}
