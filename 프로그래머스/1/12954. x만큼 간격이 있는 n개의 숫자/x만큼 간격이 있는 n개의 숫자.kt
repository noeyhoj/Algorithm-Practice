class Solution {
    fun solution(x: Int, n: Int): LongArray {
        return (1..n).toList().map { it.toLong() * x }.toLongArray()
    }
}