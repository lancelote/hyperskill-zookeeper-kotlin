package stage4.hw11

fun main() {
    val num = readLine()!!.toInt()
    val valid = num in -14..12 || num in 15..16 || 19 <= num

    println(if (valid) "True" else "False")
}
