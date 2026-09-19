class Solution {
    fun solution(n: Int): Int {
        var yacksus = mutableListOf<Int>()
        if (n == 0) return 0
        (1..n).forEach {
            if (n % it == 0) yacksus.add(it)
        }
        return yacksus.sumOf{ it }
    }
}