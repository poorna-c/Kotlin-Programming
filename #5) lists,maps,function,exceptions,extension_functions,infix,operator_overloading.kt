import java.util.*

fun main(args: Array<String>)
{
    var n = listOf(1,2,3,4,5,6)
    for(i in n)
    {
        println("$i")
    }
    for((index,value) in n.withIndex())
    {
        println("Index of $value is $index")
    }

    var m = TreeMap<String,Int>()
    m["0"] = 0
    m["1"] = 1
    for((x,y) in m)
    {
        println("$x , $y ")
    }

    println(add(10,34))
    println(add_single_line(12,43))

    // Java and Kotlin codes can be used interchangablly...
    // Here We have kotlin functions but not present in any class
    // To use them we can Access the functions with the class name of our kotlin file...
    // 1.kt -> 1Kt.class   1.kt kotlin file produces 1Kt.class file....
    // We can access function written in 1.kt file in java by
    // 1Kt.add() or 1Kt.function_name()....
    // using Kt as class name can be altered by using validators like @file:JvmName("1")
    // Thus the class file name generated is with 1.class....
    // @file:JvmName("1") first line of kotlin file...

    // @JvmOverloads can be used to overload a function

    var x : Int = try
    {
        23/(4-4)
    }
    catch(e:Exception)
    {
        -1
    }
    println(x)

    // Extension Functions in Kotlin
    // base_class is a simple class only have one function show
    // We can add another function to that class outside also
    // this are called as extension functions.
    var b1 = _base_class()
    b1.a = 20
    var b2 = _base_class()
    b2.a = 3
    var b3 = b1.times(b2) // Without infix
    println(b3.show())
    // If we want to use the times as x times y then just add infix keyword befor the
    // extension function implementation
    var b4 = b3 times b2 // With infix
    println(b4.show())
    
    // And if we want to use * operator for mulitplying the values 
    // we can simply do by just adding operator keyword ...
    var b5 = b4 * b3
    println(b5.show())




}


fun add(a : Int,b : Int): Int
{
    return a+b
}

fun add_single_line(a:Int, b:Int):Int = a+b

class _base_class
{
    var a : Int = 0
    fun show()
    {
        println(a)
    }
}
// infix takes only one parameter....
infix operator fun _base_class.times(a:_base_class) : _base_class
{
    var temp = _base_class()
    temp.a = this.a * a.a
    return temp
}