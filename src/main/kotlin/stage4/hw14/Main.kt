package stage4.hw14

fun takes(x1: Int, y1: Int, x2: Int, y2: Int): Boolean {
    val horizontal = x1 == x2
    val vertical = y1 == y2
    val leftDiagonal = x1 - y1 == x2 - y2
    val rightDiagonal = x1 + y1 == x2 + y2

    return horizontal || vertical || leftDiagonal || rightDiagonal
}

fun main() {
    val (x1, y1) = readLine()!!.split(" ").map { it.toInt() }
    val (x2, y2) = readLine()!!.split(" ").map { it.toInt() }

    println(if (takes(x1, y1, x2, y2)) "YES" else "NO")
}
