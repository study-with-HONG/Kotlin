import java.util.*

fun main(args: Array<String>) {
    //// array
//    var array = Array(5, {1})
//    for(n in array){print("$n ")}
//    println("\n" + array.contentToString())

    // java -> int array[] = { 1, 2, 3};
//    val array2 = intArrayOf(1, 2, 3)
//    println(array2) // 주소 출력
//    println(Arrays.toString(array2))
//    println(array2.contentToString()) // 둘이 같음

//    var array3 = arrayOf(1, 1.23, "가나다", true) // 자료형 달라도 됨.
//    println(array3.contentToString())
//    println(array3[2])

//    var i = 1
//    var array4 = Array(10, {i++}) // i값이 1씩 증가하면서 들어감
//    println(array4.contentToString())

    //// generic
//    var array5 = arrayOf<Int>(10, 20, 30)
//    array5.forEach { print("$it ") }
//    var array6 = arrayOf<String>("일", "이", "삼")
//    println("\n" + array6.contentToString())

//    val array7 = intArrayOf(1, 2, 3, 4, 5)
//    println(array7.size)
//    println(array7.sum())
//    println(array7.get(2)) // array7[2]
//    array7[0] = 10         // 수정
//    println(array7.contentToString())

//    for(i in array7.indices){
//        println("$i : ${array7[i]}")
//    }
//    for(j in 0..array7.size - 1){ // 부등호 자동 생성
//        println("array7[$j] = ${array7[j]}")
//    }
//    println(array7.contains(3))
//    println(3 in array7) // 둘이 같음

    //// filter
//    val array8 = arrayOf(1, -2, 3, 4, -5)
//    array8.filter { e -> e>0 }.forEach{e -> print("$e ")} // 0보다 크면 출력
//
//    val f = array8.filter { e -> e > 0 }
//    println("\n" + f)

//    val fruits = arrayOf("banana", "peach", "apple", "grape")
//    var f1 = fruits.filter { it.startsWith("a") } // 맨 앞 글자가 a
//    var f2 = fruits.sortedBy { it }               // 정렬
//    var f3 = fruits.sortedByDescending { it }     // 역순으로 정렬
//    var f4 = fruits.map { it.toUpperCase() }      // 대문자 변환
//    println(f1)

    //// DTO
//    val products = arrayOf(
//        Product("Mouse", 3000.0),
//        Product("Keyboard", 5500.0),
//        Product("Monitor", 250000.0),
//        Product("Tablet", 180000.0)
//    )
//    products.sortBy { it.price }
//    products.forEach { println("${it.name}, ${it.price}") }
}

// DTO
data class Product(val name:String, val price:Double) // data는 생략 가능
