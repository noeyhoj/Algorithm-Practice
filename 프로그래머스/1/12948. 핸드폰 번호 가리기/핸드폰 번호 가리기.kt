class Solution {
    fun solution(phone_number: String): String {
        val size = phone_number.length
        return (0 until size).map {
            if (it < size - 4) "*" else phone_number[it]
        }.joinToString("")
    }
}