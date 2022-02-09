fun main(args: Array<String>) {
    //// 추상 클래스 1
//    val prt = myPrinter()
//    prt.print() // 상속 방식 출력
//    myPrinter.print() // 객체 생성 방식 출력 -> 객체가 생성된 상태

    //// 추상 클래스 2
//    val car = Car("푸조", "deepGreen", 4900, 130)
//    var motor = MotorCycle("BMW", "black", 3300, 136)
//
//    car.spec()
//    car.year = 2022
//    car.start();    car.stop();    car.spec()
//    motor.year = 2022
//    motor.start();    motor.stop()

    //// 인터페이스 1
//    var itf = twoInter(11)
//    itf.v = 22
//    println(itf.method("interface test"))

    //// 인터페이스 2 - 다중 상속
//     val sf = StarFish()
//     sf.lightYear()
//     sf.area()
//     sf.color()
}
//// 추상 클래스 1
abstract class Printer{  // 추상 클래스 = 추상메소드 + 일반 메소드
    abstract fun print() // 추상 메소드
    fun method(){        // 일반 메소드
        println("Printer method()")
    }
}
/*class myPrinter:Printer(){ // 상속 방식, 여러 개 만들 수 있음
    override fun print() {
        println("myPrinter print()")
    }
}*/
val myPrinter = object:Printer(){ // 객체 생성 방식, 하나만 만들 수 있음
    override fun print() {
        println("myPrinter print()")
    }
}
//// 추상 클래스 2
abstract  class Vehicle(val name:String, val color:String, val price:Int){
    abstract var moter:Int
    var year = 2021

    abstract fun start()
    abstract fun stop()
    fun spec(){
        println("name='$name', color='$color', price=$price, moter=$moter, year=$year")
    }
}
class Car(name: String, color: String, price: Int, override var moter:Int):Vehicle(name, color, price){
    override fun start() {println("자동차 출발")}
    override fun stop() {println("자동차 정지")}
}
class MotorCycle(name: String, color: String, price: Int, override var moter:Int):Vehicle(name, color, price){
    override fun start() {println("오토바이 출발")}
    override fun stop() {println("오토바이 정지")}
}
//// 다중 상속 -> 클래스는 다중상속 불가 -> 방안 : 인터페이스
/*open class A(a:Int)
open class B(b:String)
class C(a:Int, b:String):A(a), B(b)*/

//// 인터페이스 1
interface Inter{
    val v:Int
    fun method(vv:String)
}
class twoInter(val _v:Int):Inter{
    override var v: Int = _v

    override fun method(vv: String) {
        println("$v $vv")
    }
}
//// 인터페이스 2 - 다중 상속
interface Star{
    val brightness:Int
    fun lightYear()
    fun color(){
        println("Star color")
    }
}
interface Fish{
    val name:String
    fun area()
    fun color(){
        println("Fish color")
    }
}
class StarFish:Star, Fish{ // 다중 상속
    override val brightness: Int = 1
    override val name: String = "guppy"

    override fun lightYear() {
        println("거리는?")
    }
    override fun area() {
        println("사는 곳은?")
    }
    override fun color() {
        super<Fish>.color()
        println("색깔은?")
    }
}
