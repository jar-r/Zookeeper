fun main() {
    val listA=mutableListOf<Int>(1, 2, 3, 4, 5);
    println(listA)

    val listItemLast=listA.last()
    val lastItemTempList=mutableListOf<Int>()
    lastItemTempList.add(listItemLast)
    println(lastItemTempList)


    val listItemFirst=listA.first()
    val firstItemTempList=mutableListOf<Int>()
    firstItemTempList.add(listItemFirst)
    println(firstItemTempList)

    listA.removeAt(0)
    listA.add(0, listItemLast)
    println(listA)

    listA.removeAt(listA.last)
}