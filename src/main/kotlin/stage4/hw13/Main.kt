package stage4.hw13

fun main() {
    val num = readLine()!!.toInt()

    fun checkDiv(div : Int) {
        if (num % div == 0) {
            println("Divided by $div")
        }
    }

    checkDiv(2)
    checkDiv(3)
    checkDiv(5)
    checkDiv(6)
}
