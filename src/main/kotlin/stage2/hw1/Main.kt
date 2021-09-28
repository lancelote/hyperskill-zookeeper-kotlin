package stage2.hw1

fun main() {
    val firstAnswer = readLine().toBoolean()
    val secondAnswer = readLine().toBoolean()
    val confession = readLine().toBoolean()

    println(!(firstAnswer xor secondAnswer) && !confession)
}
