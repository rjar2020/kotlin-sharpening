package basics

fun main() {
    println("Let's calculate you net worth in 5 years in terms of cash")
    print("Enter how much do you have in the bank today: ")
    val test = readln()
    try {
        println("You entered: ${test.toInt()}")
    } catch (e: NumberFormatException) {
        println("You entered: $test, which is not a number")
        println("The error message is: ${e.localizedMessage}")
        //Don't do this in production code
        e.printStackTrace()
    }
}
