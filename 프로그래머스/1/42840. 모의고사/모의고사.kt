class Solution {
    fun solution(answers: IntArray): IntArray {
        val user1 = listOf(1, 2, 3, 4, 5)
        val size1 = user1.size
        
        val user2 = listOf(2, 1, 2, 3, 2, 4, 2, 5)
        val size2 = user2.size
        
        val user3 = listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        val size3 = user3.size
        
        val result = mutableListOf(0, 0, 0)
        
        answers.indices.forEach {
            if (answers[it] == user1[it % size1]) result[0]++
            if (answers[it] == user2[it % size2]) result[1]++
            if (answers[it] == user3[it % size3]) result[2]++
        }
        
        val maxScore = result.maxOf{ it }
        return (0..2).filter { result[it] == maxScore }.map{ it + 1 }.toIntArray()
    }
}