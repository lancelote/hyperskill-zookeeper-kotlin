package stage3.hw12

fun main() {
    val days = readLine()!!.toInt()
    val dayFood = readLine()!!.toInt()
    val ticketOneWay = readLine()!!.toInt()
    val dayHotel = readLine()!!.toInt()

    println(ticketOneWay * 2 + days * dayFood + (days - 1) * dayHotel)
}
