class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var total = n // 빈 병의 개수
        var other = 0 // 남은 병
        var result = 0 // 받은 병
        while (true) {
            result += (total / a) * b
            other = total % a
            total = (total / a) * b + other
            if (total < a) break
        }
        return result
    }
}

// 빈병 | 받은 병 | 남은 병
// 20 | 10 | 0
// 10 + 0 | 5 | 0
// 5 + 0 | 2 | 1
// 2 + 1 | 1 | 1
// 1 + 1 | 1 | 0
