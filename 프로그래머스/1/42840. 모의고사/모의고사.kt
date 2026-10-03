class Solution {
    fun solution(answers: IntArray): IntArray {
        val n = answers.size - 1
        val a = listOf(1, 2, 3, 4, 5)
        val aSize = a.size
        
        val b = listOf(2, 1, 2, 3, 2, 4, 2, 5)
        val bSize = b.size
        
        val c = listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        val cSize = c.size
        
        val score = mutableListOf(0, 0, 0)
        (0..n).forEach {
            val answer = answers[it]
            if (answer == a[it % aSize]) score[0] += 1
            if (answer == b[it % bSize]) score[1] += 1
            if (answer == c[it % cSize]) score[2] += 1
        }
        val maxScore = score.maxOf{ it }
        val result = mutableListOf<Int>()
        (0..2).forEach {
            if (score[it] == maxScore) result.add(it + 1)
        }
        return result.toIntArray()
    }
}