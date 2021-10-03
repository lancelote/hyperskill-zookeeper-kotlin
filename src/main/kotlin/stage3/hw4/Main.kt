package stage3.hw4

fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000

    val totalHours = totalSeconds / 3600
    val hours = totalHours % 24
    val minutes = (totalSeconds - totalHours * 3600) / 60
    val seconds = totalSeconds - totalHours * 3600 - minutes * 60

    println("$hours:$minutes:$seconds")
}
