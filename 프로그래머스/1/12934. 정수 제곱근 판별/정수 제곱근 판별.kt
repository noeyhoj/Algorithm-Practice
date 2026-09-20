import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        val num = sqrt(n.toDouble()).toLong()
        return if (num * num == n) (num + 1L) * (num + 1L) else -1L
    }
}