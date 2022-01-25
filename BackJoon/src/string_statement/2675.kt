package string_statement

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val case = nextInt()
    var R = 0
    var S = ""
    var P = ""
    for (i in 0 until case) {
        R = nextInt()
        S = next()
        S.forEach {
            for (j in 0 until R) {
                P += it
            }
        }
        println(P)
        P = ""
    }
}