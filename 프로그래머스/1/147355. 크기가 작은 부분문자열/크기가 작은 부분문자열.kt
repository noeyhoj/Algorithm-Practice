class Solution {
    fun solution(t: String, p: String): Int {
        val n = p.length
        var result = 0
        (0..t.length - n).forEach {
            if (p.toLong() >= t.substring(it, it + n).toLong()) result++
        }
        return result
    }
}