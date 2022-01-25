package string_statement

import java.util.*

/** line 22
 *  if문에 size 비교할 때 등호 표시를 안해줘서
 *  ex) aabb 같은 case를 제대로 식별 못했음.
 */
fun main (arg: Array<String>) = with(Scanner(System.`in`)) {
    val S = next()
    var hashMap = HashMap<Char,Int>()
    var upper: Char
    S.forEach {
        upper = it.uppercaseChar()
        if (hashMap.containsKey(upper)) {
            hashMap[upper] = hashMap[upper]!!.toInt() + 1
        } else {
            hashMap[upper] = 1
        }
    }
    val sortedList = hashMap.toList().sortedByDescending { it.second }
    if (sortedList.size >= 2 && sortedList[0].second == sortedList[1].second) {
        println('?')
    } else {
        println(sortedList[0].first)
    }
}