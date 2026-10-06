class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var oneIdx = 0
        var twoIdx = 0
        for (word in goal) {
            if (oneIdx < cards1.size && cards1[oneIdx] == word) {
                oneIdx++
            } else if (twoIdx < cards2.size && cards2[twoIdx] == word) {
                twoIdx++
            } else {
                return "No"
            }
        }
        
        return "Yes"
    }
}