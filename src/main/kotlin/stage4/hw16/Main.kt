package stage4.hw16

fun main() {
    val triangle1 = readLine()!!.split(" ").map { it.toInt() }
    val triangle2 = readLine()!!.split(" ").map { it.toInt() }

    val x1 = triangle1.minOrNull()!!
    val z1 = triangle1.maxOrNull()!!
    val y1 = triangle1.sum() - x1 - z1

    val x2 = triangle2.minOrNull()!!
    val z2 = triangle2.maxOrNull()!!
    val y2 = triangle2.sum() - x2 - z2

    fun isEqual() = x1 == x2 && y1 == y2 && z1 == z2

    fun isSmaller() = x1 <= x2 && y1 <= y2 && z1 <= z2

    fun isBigger() = x1 >= x2 && y1 >= y2 && z1 >= z2

    if (isEqual()) {
        println("Box 1 = Box 2")
    } else if (isSmaller()) {
        println("Box 1 < Box 2")
    } else if (isBigger()) {
        println("Box 1 > Box 2")
    } else {
        println("Incomparable")
    }
}
