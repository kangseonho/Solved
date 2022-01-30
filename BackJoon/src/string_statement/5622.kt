package string_statement

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val input = readLine()
    var second = 0
    input!!.forEach {
        if ("ABC".contains(it)) {
            second += 3
        } else if ("DEF".contains(it)) {
            second += 4
        } else if ("GHI".contains(it)) {
            second += 5
        } else if ("JKL".contains(it)) {
            second += 6
        } else if ("MNO".contains(it)) {
            second += 7
        } else if ("PQRS".contains(it)) {
            second += 8
        } else if ("TUV".contains(it)) {
            second += 9
        } else if ("WXYZ".contains(it)) {
            second += 10
        }
    }
    println(second)
}