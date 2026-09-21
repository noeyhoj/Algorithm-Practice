class Solution {
    fun solution(s: String): Boolean {
        if (s.length != 4 && s.length != 6) return false
        return try {
            if (s.toInt() is Int) return true else false
        } catch(e: Exception) {
            return false
        }
    }
}