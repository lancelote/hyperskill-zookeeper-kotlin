package stage4.hw19

fun main() {
    val num = readLine()!!.toInt()

    var d = 0
    var c = 0
    var b = 0
    var a = 0

    repeat(num) {
        when (readLine()!!.toInt()) {
            5 -> a++
            4 -> b++
            3 -> c++
            2 -> d++
        }
    }

    println("$d $c $b $a")
}
