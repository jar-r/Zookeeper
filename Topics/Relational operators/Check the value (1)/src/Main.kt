fun main() {
    // put your code here
    val value = readln().toInt()
    val checkA = value < 10
    val checkB = value > 0 
    val check = checkA && checkB
    println("$check")
}
