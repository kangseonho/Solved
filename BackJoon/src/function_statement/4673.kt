package function_statement

fun main(args: Array<String>) {
    for(i in 1..10000) {
         if (!selfNum(i))
             println(i)
    }
}

fun selfNum(num: Int): Boolean {
    for (j in 1 until num) {
        var temp = j
        var result = j;
        while (temp != 0) {
            result += temp % 10
            temp /= 10
        }
        if (result == num)
            return true
    }
    return false
}