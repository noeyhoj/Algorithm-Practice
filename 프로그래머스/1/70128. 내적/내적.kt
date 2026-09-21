class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        val size = a.size
        var result = 0
        (0 until size).forEach {
            result += a[it] * b[it]
        }
        return result
    }
}