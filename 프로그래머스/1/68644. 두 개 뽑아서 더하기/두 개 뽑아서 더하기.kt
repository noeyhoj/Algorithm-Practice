class Solution {
    fun solution(numbers: IntArray): IntArray {
        val result = mutableSetOf<Int>()
        (0 until numbers.size - 1).forEach { i ->
            (i + 1 until numbers.size).forEach { j ->
                result.add(numbers[i] + numbers[j])
            }
        }
        return result.sorted().toIntArray()
    }
}