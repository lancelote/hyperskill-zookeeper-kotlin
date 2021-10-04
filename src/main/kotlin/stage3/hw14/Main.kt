package stage3.hw14

fun main() {
    val num = readLine()!!.toInt()
    if (num % 2 == 0) {
        println(num + 2)
    } else {
        println(num + 1)
    }
}
