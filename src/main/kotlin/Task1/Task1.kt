package Task1

fun main(args: Array<String>) {

    var student1= Student("Adam", "Class_1", 1)
    var student2= Student("Kate", "Class_1", 2)
    var student3= Student("Arthur", "Class_2", 3)
    var student4= Student("Ahmad", "Class_1", 4)
    var student5= Student("John", "Class_2", 4)

    var studentArrayList_1:ArrayList<Student> = ArrayList<Student>()
    var studentArrayList_2:ArrayList<Student> = ArrayList<Student>()
    var studentArrayList_3:ArrayList<Student> = ArrayList<Student>()
    var studentArrayList_4:ArrayList<Student> = ArrayList<Student>()

    studentArrayList_1.add(student1)
    studentArrayList_1.add(student2)
    studentArrayList_1.add(student3)
    studentArrayList_1.add(student4)
    studentArrayList_1.add(student5)


    for((index,item) in studentArrayList_1.withIndex())
    {
            println("${index + 1}) $item")
    }


    println("--------- \nIdGreaterThan: \n")


    for ((index, item) in studentArrayList_1.withIndex()) {

        studentArrayList_2.addAll(item.IdGreaterThan(2,studentArrayList_1))

        break
    }


    for ((index, item) in studentArrayList_2.withIndex()) {

        println("${index + 1}) $item")


    }


    println("--------- \nfindSameClass: \n")


    for ((index, item) in studentArrayList_1.withIndex()) {

        studentArrayList_3.addAll(item.findSameClass("Class_1",studentArrayList_1))

        break
    }


    for ((index, item) in studentArrayList_3.withIndex()) {

        println("${index + 1}) $item")


    }


    println("--------- \nfindLetter: \n")


    for ((index, item) in studentArrayList_1.withIndex()) {

        studentArrayList_4.addAll(item.findLetter("A",studentArrayList_1))

        break
    }


    for ((index, item) in studentArrayList_4.withIndex()) {


        println("${index + 1}) $item")
    }

}