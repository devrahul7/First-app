package com.example.firstapp



fun main(args:Array<String>) {
    var aqe = arrayOf(1,2,3)
    println(aqe)
    println("The first element of age is "+ aqe[0])
    println("The second element of age is "+ aqe[1])

    println( "third element of age is "+ aqe[2])
    println("*************************************")
    var name = arrayOf("ram","shyam" , "Hari")

    name[1] = "sandis"
    println("The first element of name is "+ name[0])

    println("The second element of name is "+ name[1])
    println("The third element of name is "+ name[2])
    println(name.size)


    //we con add value only after our orray is initialize
    var age1= ArrayList<Int>()
    age1.add(1)
    age1.add(5)

}