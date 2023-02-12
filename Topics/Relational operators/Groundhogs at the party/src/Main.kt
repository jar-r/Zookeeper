fun main() {
    // write your code here
    val cups = readln().toInt()
    val weekend = readln().toBoolean()

    // range check
    val cupsWorkingDays = cups in 10..20
    val cupsWeekends = cups in 15..25

    // range check with weekend or not
    val partyOnWeekend = weekend && cupsWeekends
    val workingDaysParty = !weekend && cupsWorkingDays

    // party if everything is true
    val party = partyOnWeekend || workingDaysParty
    println("$party")
}
