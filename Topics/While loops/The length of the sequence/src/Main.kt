fun main() {

    val itemList = mutableListOf<Int>()
    while (true) {
        val input = readln().toInt()
        if (input <= 0) {
            break
        }
        itemList.add(input)
    }
    val result = itemList.size
    println(result)
}
