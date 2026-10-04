class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxW = 0
        var maxH = 0
        
        sizes.forEach { size ->
            val w = minOf(size[0], size[1])
            val h = maxOf(size[0], size[1])
            maxW = maxOf(maxW, w)
            maxH = maxOf(maxH, h)
        }
        
        return maxH * maxW
    }
}