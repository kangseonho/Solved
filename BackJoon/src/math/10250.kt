package math

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val case = readLine().toInt()
    var H = 0
    var W = 0
    var N = 0
    for (i in 0 until case) {
        val input = readLine().split(" ")
        H = input[0].toInt()
        W = input[1].toInt()
        N = input[2].toInt()

        if (H >= N) {
            println((N.toString()+"01").toInt())
        } else {
            var floor = N%H * 100
            var seq = N/H + 1
            if (N%H == 0) {
                floor = H * 100
                seq = N/H
            }
            if (W < seq) {
                floor++
                seq = 1
            }
            println(floor+seq)
        }
    }
}