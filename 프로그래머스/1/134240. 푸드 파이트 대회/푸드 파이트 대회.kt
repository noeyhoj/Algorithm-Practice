class Solution {
    fun solution(food: IntArray): String {
        var result = ""
        (1 until food.size).forEach {
            result += it.toString().repeat(food[it] / 2)
        }
        val other = result.reversed()
        result += "0"
        result += other
        return result
    }
}