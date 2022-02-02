package math

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val input = readLine().split(" ")
    val A = input[0].toLong()
    val B = input[1].toLong()
    val V = input[2].toLong()

    if (V%A > 1) {
        print("asdf")
        println(V/A+(V/A)*B)
    } else {
        print("asd")
        println(V/A-(V/A)*B)
    }

//    if (6%5 >= 1) {
//        println(6/5+(6/5) * 1)
//    }
}