package math

/** 계차수열을 이용하여 푸는 문제
 */

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    var n = 1
    var i = 1

    if (N == 0) {
        println(0)
    } else {
        while (N > i) {
            i = (n*n+n)/2 * 6 + 1
            n++
        }
        print(n)
    }
}