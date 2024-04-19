package Task4

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    print("\nEnter: ")
    var price = scanner.nextDouble()

    println("Price: " + calculateDiscount(price))

}


fun calculateDiscount(price: Double?=null): Double? {
    return price?.let { p ->
    when {
        p < 200.0 -> {
            p * 0.9
        }

        p >= 200.0 -> {
            p * 0.8
        }

        else -> {
            p
        }
    }
    }
}
