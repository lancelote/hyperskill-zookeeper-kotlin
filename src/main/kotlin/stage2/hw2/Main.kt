package stage2.hw2

fun main() {
    val invitation = readLine().toBoolean()
    val gift = readLine().toBoolean()

    println(invitation && gift)
}
