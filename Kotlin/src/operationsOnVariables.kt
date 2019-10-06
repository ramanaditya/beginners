fun main(args: Array<String>) {

    var radius = 3
    var pi = 3.14

    var circumference = 2*pi*radius

    println("The circumference is $circumference")

    //Type conversion can be done in the following ways

    var circum: Int = 2*pi.toInt()*radius

    println("The circumference is $circum")

    // Values of a variable can be changed as follows

    var wallet = 30

    wallet += 10
    println("My wallet now has $wallet Rs :)")

    wallet -= 20
    println("My wallet now has $wallet Rs :(")

}