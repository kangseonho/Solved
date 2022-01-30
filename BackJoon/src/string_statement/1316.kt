package string_statement

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var count = 0
    for (i in 0 until nextInt()) {
        if (groupWord(readLine()!!)) {
            count++
        }
    }

    println(count)
}

fun groupWord(input: String): Boolean {
    val list = input!!.toList().distinct()
    var mutableList = mutableListOf<Int>()

    list.forEach {
        for (i in input.indices) {
            if (it == input[i]) {
                mutableList.add(i)
            }
        }
        for (j in 0 until mutableList.size) {
            if (j + 1 < mutableList.size) {
                if (mutableList[j+1] - mutableList[j] != 1) {
                    return false
                }
            }
        }
        mutableList.clear()
    }
    return true
}