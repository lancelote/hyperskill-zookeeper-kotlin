package stage4.hw20

fun main() {
    val num = readLine()!!.toInt()
    var totalPositive = 0

    repeat(num) {
        if (readLine()!!.toInt() > 0) totalPositive++
    }

    println(totalPositive)
}
