class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        val daek1 = cards1.toMutableList()
        val daek2 = cards2.toMutableList()
        
        for(i in goal) {
            if (daek1.isNotEmpty() && daek1.first() == i) {
                daek1.removeAt(0)
            } else if (daek2.isNotEmpty() && daek2.first() == i) {
                daek2.removeAt(0)
            } else {
                return "No"
            }
        }
        return "Yes"
    }
}
