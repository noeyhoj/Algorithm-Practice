class Solution {
    fun solution(babbling: Array<String>): Int {
        val babblingList = listOf("aya", "ye", "woo", "ma")
        var count = 0
        var previous = ""
        var current = ""
        
        for (word in babbling) {
            var isIt = false
            current = ""
            previous = ""
            
            for (key in word) {
                current += key
                if (current in babblingList) {
                    if (current == previous) {
                        isIt = false
                        break
                    }
                    previous = current
                    current = ""
                    isIt = true
                }
            }
            if (isIt && current.isEmpty()) count++
        }
        
        return count
    }
}