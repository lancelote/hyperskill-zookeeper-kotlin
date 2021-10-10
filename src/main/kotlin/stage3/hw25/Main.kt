package stage3.hw25

fun main() {
    repeat(4) {
        val char = readLine()!!.first()
        println(char.isDigit())
    }
}
