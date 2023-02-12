fun main() {
    var number = 0
    if (number >= 0) {
        do {
            val n = readln().toInt()
            number += n
        } while (n != 0)
        println(number)
    }
}