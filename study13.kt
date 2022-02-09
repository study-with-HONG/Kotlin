fun main(args: Array<String>) {
    //// 예제 1
//    val m = Master()
//
//    val cat = Cat("하양이", "small")
//    m.playWithPet(cat)
//    val dog = Dog("백구", "midium")
//    m.playWithPet(dog)

    //// 예제 2
//    val car = Car("BMW", "625hp")
//    car.startEngine()
//    car.stopEngine()
}
//// 예제 1
open class Animal(val name:String)
interface Pet{
    var size:String
    val msg:String
        get() = "I love my pet"
    var species:String

    fun feeding()
    fun patting(){
        println("keep patting")
    }
}
class Cat(name:String, override var size: String):Pet, Animal(name) {
    override var species: String = "cat"
    override fun feeding() {
        println("${name}~ 밥 먹자냥~")
    }
}
class Dog(name:String, override var size: String):Pet, Animal(name) {
    override var species: String = "dog"
    override fun feeding() {
        println("${name}~ 밥 멍자~")
    }
}
class Master{ // 컨트롤러
    /*  interface 이용하면 나누지 않고 한 번에 선언 가능
    fun playWithPet(dog:Dog){}
    fun playWithPet(cat:Cat){}  */
    fun playWithPet(pet:Pet){
        println(pet.species)
        pet.feeding()
    }
}
//// 예제 2
class Car(val company:String, val hp:String){
    private var engine = Engine(hp)

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power:String){
    fun start() = println("Engine start()")
    fun stop() = println("Engine stop()")
}
