class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var left = section.first()
        var right = section.last()
        var count = 0
        if (m == 1) return section.size
        while (true) {
            left += (m - 1)
            count++
            if (left >= right) break
            left = section.first { it > left }
        }
        return count
    }
}