import java.util.*

fun main(args: Array<String>) {
    //// generic 1
//    val ibox:Box<Int> = Box<Int>(1)
//    println(ibox.value)
//    val sbox:Box<String> = Box<String>("Hello")
//    println(sbox.value)
//    val box = Box(100) // 자료형 지정 안해도 가능
//    println(box.value)

    //// generic 2
//    var result = cal(5, 6, {a, b -> a + b})
//    println(result)
//    var result2 = cal(5, 6, {a, b -> a * b})
//    println(result2)
//    var result3 = cal(13, 11) {a, b -> a - b}
//    println(result3)

    //// generic 3
//    val num:MyClass<Int, Double> = MyClass<Int, Double>(30, 12.34)
//    println(num.num1) // 30
//    println(num.num2) // 12.34
//    println(num.num1 + num.num2) // 42.34
}
/* 자바에서 generic 사용방법
    class Box<T> {
        private T value; // T타입 변수 value 선언

        Box(T value){
            this.value = value;
        }
        public T getValue(){
            return value;
        } .... 기타 등등
    }
*/
//// generic 1
class Box<T>(var value:T)

//// generic 2 -> 계산식 임의 지정 가능
fun<T> cal(a:T, b:T, op:(T, T) -> T):T{
    return op(a, b)
}
//// generic 3
class  MyClass<T1, T2>(n1:T1, n2:T2){
    var num1 = n1
    var num2 = n2
}
