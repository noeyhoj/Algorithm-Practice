class Solution {
    fun solution(n: Long): Long {
        var result = ""
        n.toString().map{ it.digitToInt() }.sortedDescending().forEach {
            result += it.toString()
        }
        return result.toLong()
    }
}