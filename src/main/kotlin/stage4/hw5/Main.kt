package stage4.hw5

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val h = readLine()!!.toInt()

    if (h < a) {
        println("Deficiency")
    } else if (h in a..b) {
        println("Normal")
    } else {
        println("Excess")
    }
}
