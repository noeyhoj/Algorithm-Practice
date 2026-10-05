class Solution {
    fun getRank(i: Int): Int {
        return when (i) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var sameCount = 0
        win_nums.forEach { num ->
            if (lottos.contains(num)) sameCount++
        }
        val zeroCount = lottos.count { it == 0 }
        
        return intArrayOf(getRank(sameCount + zeroCount), getRank(sameCount))
    }
}