class Solution {
    fun solution(a: Int, b: Int): Long {
        val minNum = minOf(a, b)
        val maxNum = maxOf(a, b)
        return (minNum..maxNum).sumOf{ it.toLong() }
    }
}