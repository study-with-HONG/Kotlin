fun main(args: Array<String>) {
    //// getter, setter 예제 1
//    val user = User(100, "Jack", 20)
//    user.id = 200           // setter
//    val userId = user.id    // getter
//    println(userId)
//    user.name = "Rose"      // name Set

    //// getter, setter 예제 2
//    val Kim = FakeAge()
//    Kim.age = 17
//    println(Kim.toString())
//
//    val Hong = FakeAge()
//    Hong.age = 25
//    println(Hong.toString())
//
//    val Lee = FakeAge()
//    Lee.age = 50
//    println(Lee.toString())
}
//// getter, setter 예제 1
class User(_id:Int, _name:String, _age:Int){
    var id:Int = _id
        get() = field
    var name:String = _name
        get() = field
        set(value){
            field = value.toUpperCase()
            println("name set() $field")
        }
    var age:Int = _age
        get() = field
        set(v){
            println("age set")
        }
}
//// getter, setter 예제 2
class FakeAge{
    var age:Int = 0
        set(value){
            field = when{
                value < 19 -> 20
                value in 20..29 -> value
                else -> value -2
            }
        }
    override fun toString(): String {
        return "FakeAge(age=$age)"
    }
}
