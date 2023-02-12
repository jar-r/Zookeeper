@Suppress("MagicNumber")
fun main() {
    // put your code here
    val input0 = readln().toInt()
    val input1 = readln().toInt()
    val input2 = readln().toInt()
    val input3 = readln().toInt()
    val input4 = readln().toInt()
    val input5 = readln().toInt()
    val inputList = mutableListOf<Int>()
    inputList.add(input0)
    inputList.add(input1)
    inputList.add(input2)
    inputList.add(input3)
    inputList.add(input4)
    inputList.add(input5)

    // First time to seconds
    val firstH: Int = inputList.get(index = 0) * 3600
    val firstM: Int = inputList.get(index = 1) * 60
    val firstS: Int = inputList.get(index = 2) * 1
    val firstTime: Int = firstH + firstM + firstS
    // Second time to seconds
    val secondH: Int = inputList.get(index = 3) * 3600
    val secondM: Int = inputList.get(index = 4) * 60
    val secondS: Int = inputList.get(index = 5) * 1
    val secondTime: Int = secondH + secondM + secondS
    // Calc first time minus Second
    val difference: Int = secondTime - firstTime
    println(difference)
}

