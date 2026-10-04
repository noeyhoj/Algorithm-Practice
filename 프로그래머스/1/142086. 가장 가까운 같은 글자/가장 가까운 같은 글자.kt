class Solution {
    fun solution(s: String): IntArray {
        val isMap = mutableMapOf<Char, Int>()
        return IntArray(s.length) {
            val a = isMap[s[it]]
            if (a == null) {
                isMap[s[it]] = it
                -1
            } else {
                isMap[s[it]] = it
                it - a
            }
        }
    }
}