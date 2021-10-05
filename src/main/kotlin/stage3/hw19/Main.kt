package stage3.hw19

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(a + b == 20 || a + c == 20 || b + c == 20)
}
