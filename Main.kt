import java.util.*

fun main(args: Array<String>) {
    val fruits = arrayOf("banana", "pear", "apple", "kiwi", "avocado")

    fruits
    //    .filter { it.startsWith("a") }      // 맨 앞 글자가 'a'
        .sortedBy { it }
    //    .sortedByDescending { it }
        .map{ it.toUpperCase() }
        .forEach { println(it) }

    println(fruits.contains("apple"))

    when {  // 조건절
        "apple" in fruits -> println("Apple이 있습니다")
    }



    val products = arrayOf(
        Product("Mouse", 3000.0),
        Product("Keyboard", 5500.0),
        Product("Monitor", 250000.0),
        Product("Tablet", 180000.0)
    )

    products.sortedByDescending { it.price }.forEach { println("${it.name}, ${it.price}") }
    products.forEach { println("${it.name}, ${it.price}") }
}

// dto, vo
data class Product(val name: String, val price: Double)
/*

class Product{
    String name
    Double price

    Product(String name, Double price){

    }
    // setter, getter
}
*/



