package stage4.hw23

fun main() {
    var num = readLine()!!.toInt()
    print("$num ")

    while (num != 1) {
        if (num % 2 == 0) {
            num /= 2
        } else {
            num = num * 3 + 1
        }
        print("$num ")
    }
}
