class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var i = n
        var j = 0 
        var count = 0
        
        while (i >= a) {
            j = i % a
            count += (i / a) * b
            i = (i / a) * b + j
        }
        
        return count
    }
}