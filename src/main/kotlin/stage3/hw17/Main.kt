package stage3.hw17

fun main() {
    val butterCups = readLine()!!.toInt()
    val isWeekend = readLine().toBoolean()

    println(isWeekend && butterCups in 15..25 || !isWeekend && butterCups in 10..20)
}
