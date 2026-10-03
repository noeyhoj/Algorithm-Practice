class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var x = 0
        var y = 0
        sizes.forEach { card ->
            x = maxOf(x, minOf(card[0], card[1]))
            y = maxOf(y, maxOf(card[0], card[1]))
        }
        return x * y
    }
}