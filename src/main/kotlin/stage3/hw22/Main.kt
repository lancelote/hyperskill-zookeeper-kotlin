package stage3.hw22

fun main() {
    val char = readLine()!!.first()
    println(char.isUpperCase() || (char.isDigit() && char != '0'))
}
