class Solution {
    fun solution(s: String, n: Int): String {
        return s.map {
            if (it == ' '){
                 ' '
            } else {
                if (it.isLowerCase()) {
                    val key = it + n
                    if (key.toInt() > 122) {
                        (97 + (key.toInt() - 122) - 1).toChar()
                    } else {
                        key
                    }
                } else {
                    val key = it + n
                    if (key.toInt() > 90) {
                        (65 + (key.toInt() - 90) - 1).toChar()
                    } else {
                        key
                    }
                }
                
            }
        }.joinToString("")
    }
}