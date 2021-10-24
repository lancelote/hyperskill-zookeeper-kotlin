package stage4.hw27

fun main() {
    var total = 0

    do {
        val num = readLine()!!.toInt()
        total += num
    } while (num != 0)

    println(total)
}
