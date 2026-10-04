class Solution {
    val a = mapOf(
        "zero" to 0,
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9,
    )
    
    fun solution(s: String): Int {
        var result = ""
        var word = ""
        s.indices.forEach {
            if (s[it] in ('0'..'9')) {
                result += s[it] 
            } else {
                word += s[it]
            }
            if (word in a.keys) {
                result += a[word].toString() 
                word = ""
            }
        }
        return result.toInt()
    }
}