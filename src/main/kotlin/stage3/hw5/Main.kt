package stage3.hw5

fun countDesks(group: Int) : Int = group / 2 + group % 2

fun main() {
    val group1 = readLine()!!.toInt()
    val group2 = readLine()!!.toInt()
    val group3 = readLine()!!.toInt()

    println(countDesks(group1) + countDesks(group2) + countDesks(group3))
}
