package stage3.hw11

fun main() {
    val num = readLine()!!.toInt()

    print(num % 10)
    print(num / 10 % 10)
    print(num / 100)
}
