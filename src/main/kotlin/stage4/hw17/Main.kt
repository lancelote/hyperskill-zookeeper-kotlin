package stage4.hw17

fun main() {
    val n = readLine()!!.toInt()
    var biggest = 0

    repeat(n) {
        val num = readLine()!!.toInt()
        if (num % 4 == 0 && num > biggest) {
            biggest = num
        }
    }

    println(biggest)
}
