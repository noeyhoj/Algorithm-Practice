class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        val ss = score.sortedByDescending { it }
        val len = (ss.size / m) * m
        val sss = ss.slice(0 until len).sorted()
        var result = 0
        for (i in 0 until len step m) {
            result += (sss[i] * m)
        }
        
        return result
    }
}