class Solution {
    fun solution(arr: IntArray): IntArray {
        val minNum = arr.minOf{ it }
        val result = arr.filter{ it != minNum }.toIntArray()
        return if (result.size == 0) intArrayOf(-1) else result
    }
}