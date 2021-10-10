package stage3.hw27

fun main() {
    val list = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    val first = list.first()
    val last = list.last()

    list[0] = last
    list[list.size - 1] = first

    println(list.joinToString(separator = " "))
}
