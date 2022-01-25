package string_statement

import java.util.*
import kotlin.math.max

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    println(max(next().reversed().toInt(), next().reversed().toInt()))
}