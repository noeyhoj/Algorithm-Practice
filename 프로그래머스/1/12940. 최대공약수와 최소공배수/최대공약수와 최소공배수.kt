class Solution {
    fun f(n: Int, m: Int): Int {
        var min = 0
        if (m == 1) return 1
        for (i in 1..n) {
            if (n % i == 0 && m % i == 0) min = maxOf(min, i)
        }
        return min
    }
    
    fun solution(n: Int, m: Int): IntArray {
        val a = minOf(n, m)
        val b = maxOf(n, m)
        val key = f(n, m)
        
        return intArrayOf(
            key,
            key * (a / key) * (b / key)
        )
    }
}