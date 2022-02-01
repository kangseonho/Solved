package string_statement

/** Scanner에서 nextInt로 케이스 N개를 입력 받을 때
 *  백준 컴파일러에서는 null pointer 런타임 에러가 발생.(intelliJ에서는 정상적으로 작동하는데?)
 */

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var count = 0
    for (i in 0 until readLine().toInt()) {
        if (groupWord(readLine()!!)) {
            count++
        }
    }
    println(count)
}

fun groupWord(input: String): Boolean {
    val list = input.toList().distinct()
    val mutableList = mutableListOf<Int>()
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