package stage4.hw25

fun main() {
    var balance = readLine()!!.toInt()
    val payments = readLine()!!.split(" ").map { it.toInt() }

    for (payment in payments) {
        if (payment <= balance) {
            balance -= payment
        } else {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $payment.")
            return
        }
    }

    println("Thank you for choosing us to manage your account! Your balance is $balance.")
}
