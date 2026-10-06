class Solution {
    fun f(num: Int): Int {
        var count = 0
        
        for (i in 1..num) {
            if (num % i == 0) count++
        }
        
        return count
    }
    
    fun solution(number: Int, limit: Int, power: Int): Int {
        return (1..number).map {
            val res = f(it)
            if (res > limit) power else res
        }.sumOf { it }
    }
}