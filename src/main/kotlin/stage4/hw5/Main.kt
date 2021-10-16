package stage4.hw5

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val h = readLine()!!.toInt()

    if (h < a) {
        println("Deficiency")
    } else if (a <= h && h <= b) {
        println("Normal")
    } else {
        println("Excess")
    }
}
