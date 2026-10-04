import kotlin.math.sqrt

class Solution {
    fun f(n: Int): Int {
        if (n == 1) return 1
        if (n == 2 || n == 3) return 2
        var count = 0
        for (i in 1..n) {
            if (n % i == 0) count++
        }
        return count
    }
    
    fun solution(number: Int, limit: Int, power: Int): Int {
        return (1..number).map {
            val p = f(it)
            if (p <= limit) p else power
        }.sumOf { it }
    }
}