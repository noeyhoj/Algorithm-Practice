class Solution {
    fun solution(board: Array<IntArray>): Int {
        val n = board.size
        val danger = Array(n) { Array(n) { false } }
        var result = 0
        
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (board[i][j] == 1) {
                    val minI = maxOf(i - 1, 0)
                    val maxI = minOf(i + 1, n - 1)
                    val minJ = maxOf(j - 1, 0)
                    val maxJ = minOf(j + 1, n - 1)
                    for (k in minI..maxI) {
                        for (l in minJ..maxJ) {
                            if (!danger[k][l]) danger[k][l] = true
                        }
                    }
                }
            }
        }
        danger.forEach { a ->
            result += a.count { !it }
        }
        return result
    }
}