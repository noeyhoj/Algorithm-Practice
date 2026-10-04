class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val result = mutableListOf<Int>()
        val answer = mutableListOf<Int>()
        score.forEach {
            result.add(it)
            if (result.size < k) {
                answer.add(result.sortedByDescending{ it }.last())
            } else {
                answer.add(result.sortedByDescending{ it }[k - 1])
            }
        }
        return answer.toIntArray()
    }
}