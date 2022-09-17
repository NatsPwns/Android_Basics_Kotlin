fun main() {
    val age = 24
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printCakeCandles(age: Int){
    print(" ")
    repeat(age) {
        print(",")
    }
    println() //Print empty line for neatness

    print(" ") //Print the inset of the candles in the cake
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeTop(age: Int){
    repeat(age+2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }    
}

    