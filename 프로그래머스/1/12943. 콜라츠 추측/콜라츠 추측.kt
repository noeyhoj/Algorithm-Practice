class Solution {
    fun f(num: Long): Long {
        return when {
            num % 2 == 0L -> num / 2
            else -> num * 3 + 1
        }
    }
    fun solution(num: Int): Int {
        if (num == 1) return 0
        var answer = num.toLong()
        var i = 0
        while (true) {
            if (answer == 1L) return i
            if (i > 500) return -1
            answer = f(answer)
            i++
        }
    }
}