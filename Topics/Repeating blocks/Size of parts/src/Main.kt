fun main() {
    // put your code here
    val n = readln().toInt()
    var perfect = 0
    var larg = 0
    var small = 0
    repeat(n) {
        val x = readln().toInt()
        if (x == 0) { perfect++ }
        else if (x == 1) { larg++ }
        else if (x == -1) { small++ }
    }
    print("$perfect $larg $small")
}
