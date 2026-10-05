class Solution {
    fun solution(ingredient: IntArray): Int {
        val stack = IntArray(ingredient.size)
        var size = 0
        var count = 0
        
        for (i in ingredient) {
            stack[size] = i
            size++
            
            if (size >= 4 && 
                stack[size - 4] == 1 && 
                stack[size - 3] == 2 && 
                stack[size - 2] == 3 && 
                stack[size - 1] == 1
            ) {
                size -= 4
                count++
            }
        }
        
        return count
    }
}