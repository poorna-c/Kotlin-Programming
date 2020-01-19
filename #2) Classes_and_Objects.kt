class Student {
    var name:String = ""
    var id:Int = 0
    var branch:String = ""
}

fun main(args:Array<String>)
{
    var s1 = Student()
    s1.name = "Poorna Chand"
    s1.id = 302
    s1.branch = "CSE"

    println("Student name: ${s1.name}\nStudent Id: ${s1.id}\nStudent Branch: ${s1.branch}")

}