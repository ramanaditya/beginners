fun main(args: Array<String>) {
    // There are two types of for loops

    // Type 1
    for (x in 1..10) {
        println(x)
    } // It prints from 1 to 10

    var myList = listOf<String>("India","Australia","United states of America")

    for(countries in myList){
        println(countries)
    }
}