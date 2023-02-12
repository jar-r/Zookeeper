fun main() {    
    // write your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    // a = should sleep at least - A
    // b = should not sleep more than - B
    // c = actual h how much Ann sleeps - H

    if (c <= b && c >= a) {
        println("Normal")
    } else if (c < b) {
        println("Deficiency")
    } else { println("Excess") }
}
