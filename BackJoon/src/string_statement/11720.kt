package string_statement

import java.util.*

fun main(args: Array<String>) = with(System.`in`) {
    val scanner = Scanner(this)
    val N = scanner.nextInt()
    var result = 0
    val string = scanner.next()

    for (i in 0 until N) {
        result += string.get(i).toString().toInt()
    }
    println(result)
}