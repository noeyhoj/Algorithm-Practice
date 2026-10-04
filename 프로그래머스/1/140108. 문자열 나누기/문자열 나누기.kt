class Solution {
    fun solution(s: String): Int {
        var count = 0
        var stdCount = 0
        var standard = ""
        var current = ""
        var result = 0
        s.forEach { word ->
            if (standard.isEmpty()) {
                standard += word
                current += word
                stdCount++
            } else {
                current += word
                if (standard == word.toString()) {
                    stdCount++
                } else {
                    count++
                }
            }
            
            if (count == stdCount)  {
                result++
                count = 0
                stdCount = 0
                standard = ""
                current = ""
            }
        }
        if (current.isNotEmpty()) result++
        return result
    }
}