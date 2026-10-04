import kotlin.math.sqrt

class Solution {
    fun f(num: Int): Boolean {
        if (num == 1) return false
        if (num == 2 || num == 3) return true
        
        for (i in 2..sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }
        return true
    }
    
    fun solution(nums: IntArray): Int {
        var count = 0
        
        for (i in (0 until nums.size - 2)) {
            for (j in (i + 1 until nums.size - 1)) {
                for (k in (j + 1 until nums.size)) {
                    if (f(nums[i] + nums[j] + nums[k])) {
                        count++
                    }
                }
            }
        }
        return count
    }
}