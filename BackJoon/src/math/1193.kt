package math

/** 입력 받은 수 단계 판별 (계차수열 (n^2+n)/2)
 *  단계 홀수 짝수 판별
 *  홀수인 경우 -> 분자 내림차순, 분모 오름차순
 *  짝수인 경우 -> 분자 오름차순, 분모 내림차순
 */

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    var n = 0
    var numer = 0
    var denom = 0
    while (true) {
        if (N <= (n*n+n)/2) {
            if (n % 2 == 0) {
                numer = n - ((n*n+n)/2-N)
                denom = n+1 - numer
                println("${numer}/${denom}")
            } else {
                numer = ((n*n+n)/2-N)+1
                denom = n+1 - numer
                println("${numer}/${denom}")
            }
            break
        }
        n++
    }
}