package com.example.firstapp

fun main(args: Array<String>) {

    println("Hello world")

    var age = 20

    age = 25

    val roll = 15

    // roll = 10 // This line is commented out because it will cause a compilation error

    var a: Boolean = true

    var b: Char = 'R' // Changed 'char' to 'Char' (Kotlin is case-sensitive)

    var c: Byte = 12 // Changed 'byte' to 'Byte'

    var d: Short = -356

    var e: Int = 43543

    var f: Long = -51321354L

    var i: Float = 5.6451344F

    var h: Double = 7.32644564

    println(a)

    println(b)

    println(c)

    println(d)

    println(e)

    println(f)

    println(i)

    println(h)

    var p: Double = 132.32

    var y: Int = p.toInt() // Changed 'x' to 'p' to match the variable name

    var z: Byte = y.toByte()

    println(p)

    println(y)

    println(z)

    var str: String = "Hello world" // Changed variable name from 'a' to 'str' to avoid redeclaration

    var length: Int = str.length // Changed variable name from 'i' to 'length' for clarity

    var isEqual: Boolean = str.equals("Hello world") // Changed variable name from 'x' to 'isEqual' for clarity

    var username: String = "softwarica "

    println(username.trim())

    println(str)

    println(length)

    println(str.isEmpty())

    println(str.lowercase())

    println(str.uppercase())

    println(isEqual)

    println(str + ", How are you?") // Changed to use '+' operator for string concatenation

}
