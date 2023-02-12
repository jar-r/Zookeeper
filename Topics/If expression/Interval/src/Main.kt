fun main() {
    // write your code here
    val n = readln().toLong()
    if (n > -15 && n <= 12) {
        println("True")
    } else if (n > 14 && n < 17) {
        println("True") 
    } else if (n >= 19 && n < Long.MAX_VALUE) {
        println("True") 
    } else { println("False") }
}

