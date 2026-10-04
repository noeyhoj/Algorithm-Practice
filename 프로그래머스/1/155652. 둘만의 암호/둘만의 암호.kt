class Solution {
    fun f(c: Char, skip: List<Char>, index: Int): Char {
        var count = 0
        var result = c
        
        while (count < index) {
            result += 1
            if (result == '{') result = 'a'
            while (result in skip) {
                result += 1
                if (result == '{') result = 'a'
            }
            count++
        }
        return result
    }
    fun solution(s: String, skip: String, index: Int): String {
        val skips = skip.toList()
        return s.map {
            f(it, skips, index)
        }.joinToString("")
    }
}