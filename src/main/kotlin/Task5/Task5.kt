package Task5

import java.util.*

fun main(args: Array<String>) {


    val scanner = Scanner(System.`in`)

    print("\nEnter: ")

    var choose = scanner.nextInt()

    println(scholarship(choose,100.0))
}

fun scholarship(choose:Int?=null,scholarship:Double?=null):String{

    choose.let {
        scholarship.let {

            return when(choose) {
                1 -> {
                    "${SchoolType.Primaryschool.toString()} scholarship is ${scholarship}"
                }
                2 -> {
                    "${SchoolType.Secondaryschool.toString()} scholarship is ${scholarship?.plus(20.0)}"
                }
                3 -> {
                    "${SchoolType.College.toString()} scholarship is ${scholarship?.plus(50.0)}"
                }
                4 -> {
                    "${SchoolType.University.toString()} scholarship is ${scholarship?.plus(100.0)}"
                }

                else -> {
                    "False choose"
                }
            }
        }
    }

}
