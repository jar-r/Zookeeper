fun main() {
    // put your code here
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    val a = num1
    val b = num2
    val c = num3
    val rangeA = c >= a
    val rangeB = a >= b
    val rangeC = c >= b
    val rangeD = b >= a
    val rangeE = a >= c
    val rangeF = b >= c
    val rangeAB = rangeA && rangeB
    val rangeAC = rangeA && rangeC
    val rangeDE = rangeD && rangeE
    val rangeDF = rangeD && rangeF
    val rangeOne = rangeAB && rangeAC
    val rangeTwo = rangeDE && rangeDF
    val range = rangeOne || rangeTwo
    println("$range")
}
