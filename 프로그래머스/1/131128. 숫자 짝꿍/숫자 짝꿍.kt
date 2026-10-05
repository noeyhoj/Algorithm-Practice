class Solution {
    fun solution(X: String, Y: String): String {
        val xArray = IntArray(10) { 0 }
        val yArray = IntArray(10) { 0 }
        val result = IntArray(10) { 0 }
        
        for (i in X) {
            xArray[i.digitToInt()] += 1
        }
        
        for (j in Y) {
            yArray[j.digitToInt()] += 1
        }
        
        (0 until 10).forEach {
            result[it] = minOf(xArray[it], yArray[it])
        }
        
        if (result.all { it == 0 }) return "-1"
        if (result[0] > 0 && result.slice(1 until 9).all { it == 0 }) return "0"
        var answer = ""
        
        for (l in 0..9) {
            answer += l.toString().repeat(result[l])
        }
        
        return answer.reversed()
    }
}