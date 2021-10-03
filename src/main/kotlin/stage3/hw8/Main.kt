package stage3.hw8

fun main() {
    val squirrels = readLine()!!.toInt()
    val nuts = readLine()!!.toInt()
    val left = nuts % squirrels

    println(left)
}
