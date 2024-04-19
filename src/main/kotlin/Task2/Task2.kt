package Task2

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    print("Enter name: ")
    val name = scanner.next()

    print("Enter password: ")
    val password = scanner.next()


        if (name.contains("User") && password.contains("password")) {
            println("Welcome")

        } else {
            println("Try again")
        }

}