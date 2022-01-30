package string_statement

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val input = readLine()
    var count = 0
    for (i in input!!.indices) {
        if (i != 0) {
            if (input[i] == '=' && (input[i-1] == 'c' || input[i-1] == 's')) {
                count++
            } else if(input[i] == '=' && input[i-1] == 'z') {
                if (i-2 >= 0) {
                    if (input[i-2] == 'd') {
                        count+=2
                    } else {
                        count++
                    }
                } else {
                    count++
                }
            } else if(input[i] == '-' && (input[i-1] == 'c' || input[i-1] == 'd')) {
                count++
            } else if(input[i] == 'j' && (input[i-1] == 'l' || input[i-1] == 'n')) {
                count++
            }
        }
    }
    println(input.length-count)
}