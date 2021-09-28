package stage2.hw3

fun main() {
    val x = readLine().toBoolean()
    val y = readLine().toBoolean()
    val z = readLine().toBoolean()

    println(!(x && y) || z)
}
