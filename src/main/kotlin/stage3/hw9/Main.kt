package stage3.hw9

fun main() {
    val hours1 = readLine()!!.toInt()
    val minutes1 = readLine()!!.toInt()
    val seconds1 = readLine()!!.toInt()

    val hours2 = readLine()!!.toInt()
    val minutes2 = readLine()!!.toInt()
    val seconds2 = readLine()!!.toInt()

    val epoh1 = hours1 * 3600 + minutes1 * 60 + seconds1
    val epoh2 = hours2 * 3600 + minutes2 * 60 + seconds2

    val diff = epoh2 - epoh1

    println(diff)
}
