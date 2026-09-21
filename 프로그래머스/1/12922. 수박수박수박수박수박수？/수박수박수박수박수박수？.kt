class Solution {
    fun solution(n: Int): String {
        return when {
            n == 1 -> "수"
            n % 2 == 0 -> "수박".repeat(n / 2)
            else -> "수박".repeat(n / 2) + "수"
        }
    }
}