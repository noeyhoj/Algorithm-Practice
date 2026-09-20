class Solution {
    fun solution(arr: IntArray): Double {
        return arr.toList().sumOf{ it.toDouble() } / arr.size
    }
}