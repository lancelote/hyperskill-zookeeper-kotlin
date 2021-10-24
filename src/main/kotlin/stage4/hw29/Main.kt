package stage4.hw29

fun main() {
    var count = readLine()!!.toInt()
    var currentNum = 1

    while (count != 0) {
        repeat(currentNum) {
            print("$currentNum ")
            count--

            if (count == 0) {
                return
            }
        }
        currentNum++
    }
}
