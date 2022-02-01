package math

/** 시간 제한 때문에 반복문이 아니라 수식으로 푸는 문제
 *  Scanner next로 나누어서 입력 받는거 보다
 *  버퍼로 입력 받아서 split하는게 20ms정도 더 빠른듯
 */

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val input = readLine().split(" ")
    val A = input[0].toLong()
    val B = input[1].toLong()
    val C = input[2].toLong()

    if (B >= C) {
        println("-1")
    } else {
        println(A/(C-B) + 1)
    }
}