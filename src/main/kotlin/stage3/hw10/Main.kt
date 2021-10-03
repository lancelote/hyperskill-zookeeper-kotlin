package stage3.hw10

fun main() {
    val squirrels = readLine()!!.toInt()
    val nuts = readLine()!!.toInt()

    val each = nuts / squirrels

    println(each)
}