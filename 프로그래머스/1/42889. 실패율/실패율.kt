class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val n = (1..N).associate { stage ->
            val a = stages.count { it == stage }.toDouble()
            val b = stages.count { it >= stage }
            if (b == 0) {
                stage to 0.0
            } else {
                stage to a / b
            }
        }
        return n.keys.sortedByDescending { n[it] }.toIntArray()
    }
}