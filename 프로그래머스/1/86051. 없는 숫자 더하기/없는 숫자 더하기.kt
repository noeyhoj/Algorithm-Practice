class Solution {
    fun solution(numbers: IntArray): Int {
        return (0..9).filter{ !numbers.contains(it) }.sumOf{ it }
    }
}