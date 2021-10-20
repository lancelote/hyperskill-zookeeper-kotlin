package stage4.hw12

import kotlin.math.abs

fun isBeat(x1 : Int, y1: Int, x2 : Int, y2 : Int) : Boolean {
    return abs(x2 - x1) == 1 && abs(y2 - y1) == 2 || abs(x2 - x1) == 2 && abs(y2 - y1) == 1
}

fun main() {
    val (x1, y1) = readLine()!!.split(" ").map { it.toInt() }
    val (x2, y2) = readLine()!!.split(" ").map { it.toInt() }

    println(if (isBeat(x1, y1, x2, y2)) "YES" else "NO")
}
