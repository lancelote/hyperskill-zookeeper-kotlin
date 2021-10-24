package stage4.hw24

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var currentPosition = 1
    var maxValue = Int.MIN_VALUE
    var maxPosition = 1 // 1-based

    while (scanner.hasNextInt()) {
        val num = scanner.nextInt()

        if (num > maxValue) {
            maxValue = num
            maxPosition = currentPosition
        }

        currentPosition++
    }

    println("$maxValue $maxPosition")
}
