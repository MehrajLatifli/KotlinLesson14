package Task1

data class Student(var name:String?=null, var className:String?=null, var id:Int?=null) {

    fun IdGreaterThan(id_:Int?=null,students: ArrayList<Student>?=null): ArrayList<Student> {

        return students!!.filter { it.id!! > id_!! }.toCollection(ArrayList())
    }

    fun findSameClass(className_:String?=null,students: ArrayList<Student>?=null): ArrayList<Student> {

        return students!!.filter { it.className==className_ }.toCollection(ArrayList())
    }

    fun findLetter(name_:String?=null,students: ArrayList<Student>?=null): ArrayList<Student> {

        return students!!.filter { it.name!!.contains(name_!!) }.toCollection(ArrayList())
    }
}