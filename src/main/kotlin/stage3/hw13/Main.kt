package stage3.hw13

fun main() {
    val num = readLine()!!.toInt()
    println(num % 10 + num / 100 + num / 10 % 10)
}
