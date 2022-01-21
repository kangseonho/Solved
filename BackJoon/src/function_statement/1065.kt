package function_statement

import java.util.*

fun main(arg: Array<String>) = with(System.`in`) {
    val scanner = Scanner(this)
    val value = scanner.nextInt()
    var result = 0
    if (value.toString().length < 3)
        println(value)
    else {
        result = 99
        for (i in 100..value) {
            if (arithmetic(i.toString()))
                result +=1
        }
        println(result)
    }
}

fun arithmetic(num: String): Boolean {
    val sqeunce = num[0] - num[1]
    for (j in 1 until num.length) {
        if (j+1 < num.length) {
            if (num[j] - num[j+1] != sqeunce)
                return false
        }
    }
    return true
}