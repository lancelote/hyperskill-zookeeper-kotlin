package stage4.hw8

fun main() {
    val num = readLine()!!.toInt()

    println(if (num > 0) {
        "positive"
    } else if (num == 0) {
        "zero"
    } else {
        "negative"
    })
}
