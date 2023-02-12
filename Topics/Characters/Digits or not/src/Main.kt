fun main() {
    // write your code here
    
    val chOne = readln().first()
    val chTwo = readln().first()
    val chThree = readln().first()
    val chFour = readln().first()

    val isDigitOne = chOne >= '\u0030' && chOne <= '\u0039'
    println(isDigitOne)
    val isDigitTwo = chTwo >= '\u0030' && chTwo <= '\u0039'
    println(isDigitTwo)
    val isDigitThree = chThree >= '\u0030' && chThree <= '\u0039'
    println(isDigitThree)
    val isDigitFour = chFour >= '\u0030' && chFour <= '\u0039'
    println(isDigitFour)
}
