class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val a =  (1..N).associate { num ->
            val total = stages.count { it >= num }.toDouble()
            val numCount = stages.count { it == num }
            
            num to if (total == 0.0) 0.0 else (numCount / total)
        }
        return a.keys.sortedByDescending { a[it] }.toIntArray()
    }
}