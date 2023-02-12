fun main() {

    val a = readln()
    val b = readln().toInt()
    val c = readln().toInt()

    println(if (a > c && a > b) {
        // put your code here
        a } else if (b > a && b > c) {
        b } else {
        // and here
        c })
}