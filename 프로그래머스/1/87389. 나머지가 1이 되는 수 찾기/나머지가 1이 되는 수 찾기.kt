class Solution {
    fun solution(n: Int): Int {
        (1..n).forEach {
            if (n % it != 0) {
                if (n % it == 1) {
                    return it
                }
            }
        }
        return 0
    }
}