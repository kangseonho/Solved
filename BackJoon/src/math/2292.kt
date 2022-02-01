package math

/** 계차수열을 이용하여 푸는 문제
 */

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    var n = 0
    var i = 0

    while (N > i) {
        i = (n*n+n)/2 * 6
        n++
    }
    print(n)
}