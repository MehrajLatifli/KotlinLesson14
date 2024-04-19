package Task4

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    print("\nEnter: ")
    var price = scanner.nextDouble()

    println("Discount: " + calculateDiscount(price))

}


fun calculateDiscount(price: Double): Double {
    return when {
        price < 200.0 -> {
            price * 0.9
        }
        price >= 200.0 -> {
            price * 0.8
        }
        else -> {
            price
        }
    }
}
