package stage4.hw22

fun main() {
    var largest = 0

    do {
        val num = readLine()!!.toInt()
        if (num > largest) largest = num
    } while (num != 0)

    println(largest)
}
