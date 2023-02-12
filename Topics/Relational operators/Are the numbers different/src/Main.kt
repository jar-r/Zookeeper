fun main() {
    // put your code here
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    val numbers = listOf(num1, num2, num3)
    val result = numbers.size == numbers.toSet().size
    println("$result")
}
