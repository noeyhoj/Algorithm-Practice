import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int {
        var yacksus = mutableSetOf<Int>()
        if (n == 0) return 0
        (1..sqrt(n.toFloat()).toInt()).forEach {
            if (n % it == 0) {
                yacksus.add(it)
                yacksus.add(n / it)
            }
        }
        return yacksus.sumOf{ it }
    }
}