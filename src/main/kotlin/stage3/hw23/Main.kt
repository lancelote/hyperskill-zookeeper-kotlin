package stage3.hw23

fun main() {
    val num = readLine()!!.toInt()
    val char = readLine()!!.first()
    println(num == char.code)
}
