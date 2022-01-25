package string_statement

import java.util.*

fun main(args: Array<String>) = with(System.`in`) {
    val scanner = Scanner(this)
    val array = Array(26) { -1 }
    val S = scanner.next()
    S.forEachIndexed { index, c ->
        if (array[c.code - 97] == -1)
            array[c.code - 97] = index
    }

    array.forEach { println(it) }
}

