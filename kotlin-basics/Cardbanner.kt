fun main () {
    val border = "'-._,-'"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println("  Happy Birthday, Tommie!")
    printBorder(border, timesToRepeat)
}
fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
            print(border)
    } 
    println("")
}