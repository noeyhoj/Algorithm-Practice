class Solution {
    fun solution(t: String, p: String): Int {
        val keysize = p.length
        var count = 0
        
        for (idx in 0..t.length - keysize) {
            val key = t.substring(idx until (idx + keysize))
            if (key.toLong() <= p.toLong()) count++
        }
        
        return count
    }
}