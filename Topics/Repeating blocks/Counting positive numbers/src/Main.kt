fun main() {
    // put your code here
    // add first index to list
    val n = readln().toInt()
    val numbers = mutableListOf<Int>()
    numbers.add(n)

    // repeat x times as the first index in the list
    repeat(n) {
        val next = readln().toInt()
            numbers.add(next) }

    // filter for positive numbers
    val filteredNumbers = numbers.filter { e -> e > 0 }
    val result = (filteredNumbers.count()) - 1
    print(result)
}
