fun main() {
    val n = readLine()!!.toInt()

    var a = 0
    var b = 0
    var c = 0
    var d = 0
    repeat(n) {
        val grades = readLine()!!.toInt()
        val result = when (grades) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
            else -> {}
        }
    }
    print("$a $b $c $d".reversed())
}
