package string_statement

/** next(): space로 짤림
 *  nextline(): 한 문장 전체를 입력
 */
import java.util.*

fun main(arg: Array<String>) = with(Scanner(System.`in`)) {
    val S = " "+nextLine()
    var count = 0
    for (i in S.indices) {
        if (S.length > i+1) {
            if (S.get(i) == ' ' && S.get(i+1) != ' ') {
                count += 1
            }
        }
    }
    println(count)
}