package stage4.hw3

fun main() {
    val (hours, minutes, seconds) = readLine()!!.split(" ")
    val (day, month, year) = readLine()!!.split(" ")

    println("$hours:$minutes:$seconds $day/$month/$year")
}
