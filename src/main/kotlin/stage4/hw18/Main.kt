package stage4.hw18

fun main() {
    val num = readLine()!!.toInt()

    var perfect = 0
    var larger = 0
    var smaller = 0

    repeat(num) {

        when (readLine()!!.toInt()) {
            0 -> perfect++
            1 -> larger++
            else -> smaller++
        }
    }

    println("$perfect $larger $smaller")
}
