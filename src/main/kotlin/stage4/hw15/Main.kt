package stage4.hw15

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    val isValid = a + b > c && a + c > b && b + c > a

    println(if (isValid) "YES" else "NO")
}
