package math

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val input = readLine().split(" ")
    val A = input[0].toLong()
    val B = input[1].toLong()
    val V = input[2].toLong()

    if ((V-B)%(A-B) == 0L) {
        println((V-B)/(A-B))
    } else {
        println((V-B)/(A-B)+1)
    }
}