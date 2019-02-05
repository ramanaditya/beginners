fun main(args: Array<String>) {
    // The following variable is a boolean type
    var isDogAlive: Boolean = true

    //Specifying the type as Boolean is not necessary

    if(isDogAlive) {
        println("Dog is alive")
    } else {
        println("Dog is dead")
    }

    /*The if condition checks the value of isDogAlive and if its true if statement is executed or else
    the else statement*/

    //We can also use if to compare the values of variables too.

    var age = 18

    if(age>=18) {
        println("Age is equal or greater than 18")
    } else {
        println("You are less than 18 years old")
    }
}