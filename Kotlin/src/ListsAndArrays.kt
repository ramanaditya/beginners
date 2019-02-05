fun main(args: Array<String>) {
    // Creating an Immutable list that is whose contents are fixed
    var myList = listOf(1,2,3,4,5)

    //Creating a Mutable list
    var myList2 = mutableListOf(1,2,3,4,5)
    myList2.add(5,0) //we add element 5 to position 0

    //Creating an empty list of Strings
    var myList3 = listOf<String>()

    var size = myList3.size // It returns the size of the list
    println(size)


    // Creating an Array
    var myArray = arrayOf(1,2,3,4,5)

}