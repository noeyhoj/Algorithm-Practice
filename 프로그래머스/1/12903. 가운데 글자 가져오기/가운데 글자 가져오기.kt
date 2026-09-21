class Solution {
    fun solution(s: String): String {
        val attention = s.length / 2
        return if (s.length % 2 == 1) s[attention].toString() else s.substring(attention - 1, attention + 1)
    }
}