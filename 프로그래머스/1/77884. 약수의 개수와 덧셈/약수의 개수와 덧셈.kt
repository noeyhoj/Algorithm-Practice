import kotlin.math.sqrt

class Solution {
    fun f(num: Int): Int {
        var result = 0
        val a = sqrt(num.toDouble()).toInt()
        (1..a).forEach {
            if (num / it == a && num % a == 0) {
                 result += 1 
            } else {
                if (num % it == 0) result += 2
            }
        }
        println("$num : $result")
        return result
    }
    fun solution(left: Int, right: Int): Int {
        var result = 0
        (left..right).forEach { num ->
            if (f(num) % 2 == 0) result += num else result -= num
        }
        return result
    }
}