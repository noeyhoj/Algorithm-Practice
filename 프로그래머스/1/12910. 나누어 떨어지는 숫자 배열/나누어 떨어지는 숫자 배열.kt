class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val result = arr.filter { it % divisor == 0 }.sorted().toIntArray()
        return if (result.size == 0) intArrayOf(-1) else result
    }
}