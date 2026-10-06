class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        if (m == 1) return section.size
        
        var secIdx = section.minOf { it }
        val maxSec = section.maxOf { it }
        var count = 0
        
        while (secIdx <= maxSec) {
            secIdx = secIdx + m - 1
            count++
            if (secIdx >= maxSec) break
            secIdx = section.first { it > secIdx }
        }
        
        return count
    }
}