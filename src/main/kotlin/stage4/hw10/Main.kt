package stage4.hw10

fun isLeap(year : Int) : Boolean {
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
}

fun main() {
    val year = readLine()!!.toInt()
    println(if (isLeap(year)) "Leap" else "Regular")
}
