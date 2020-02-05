fun main(args : Array<String>)
{
    var num1 : Int = 52
    var num2 : Int = -32
    var max : Int? = null
    var min : Int? = null


    // Following are called as Expressions and in expression there must be else part 

    max = if(num1>num2)
            num1
        else
            num2

    // Following code produces error since there is no else part
    // max = if(num1>num2)
    //         num1

    min = if(num1>num2) num2 else num1

    var temp = if(num1==0) 0 else if(num1>0) "Positive" else "Negative"

    println("Maximum Number: $max")
    println("Minimum Number: $min")
    println("Num1 Variable is: $temp")


    // String Comparision 
    var str1: String = "PC"
    var str2: String = "pc"
    if(str1.equals(str2,ignoreCase=true)) println("Strings are same!!!") else println("Strings are not Same!!!")
    println(if(str1.equals(str2)) "Strings are same!!!" else "Strings are not Same!!!")



    // When (Replacement for switch case)
    when(num1)
    {
        0 -> println("Zero")
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Nothing Matches !!!")
    }
    println(when(num1){0->"Zero" 1->"One" else->"Nothing Matches !!!"})
    // Also Works with semicolons
    println(when(num1){0->"Zero";1->"One";else->"Nothing Matches !!!"})


    while(num2==num1)
    {
        print("$num2 ")
        num2++;
    }

    var x = 1..20
    println("x is: "+x)

    for(i in x)
    {
        print("$i ")
    }

    println("\nThe Following Output...")
    for(i in 10..1)
    {
        print("$i ")
    }
    

    for(i in 10 downTo 1)
    {
        print("$i ")
    }
    println("\ndownTo is a Method of Int Class... 10.downTo(1) <==> 10 downTo 1")
    for(i in 10.downTo(1))
    {
        print("$i ")
    }
    println("\nUsing until")
    // 1..10 gives range from 1 to 10 but if we want that even we specify 10 we need till 9 then we use until
    for(i in 1 until 10) print("$i ")
    
    println("\nAlso Using for characters...")
    for(i in 'A'..'z') print("$i ")

}