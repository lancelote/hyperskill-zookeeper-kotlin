package stage4.hw28

fun main() {
    val limit = readLine()!!.toInt()
    var current = 1
    var power = 1

    while (power <= limit) {
        println(power)
        current++
        power = current * current
    }
}
