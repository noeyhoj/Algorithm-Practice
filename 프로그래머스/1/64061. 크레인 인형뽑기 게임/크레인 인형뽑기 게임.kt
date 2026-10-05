class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        val stack = IntArray(900) { 0 }
        var size = 0
        var count = 0
        
        val newBoard = mutableListOf<MutableList<Int>>()
        for (i in board[0].indices) {
            val newList = mutableListOf<Int>()
            for (j in board.indices) {
                newList.add(board[board.size - j - 1][i])
            }
            newBoard.add(newList.filter { it != 0 }.toMutableList())
        }
        
        for (move in moves) {
            if (newBoard[move - 1].isEmpty()) continue
            val idx = newBoard[move - 1].removeLast()
            stack[size] = idx
            size++
            if (size >= 2 && stack[size - 2] == stack[size - 1]) {
                size -= 2
                count++
            }
        }
        
        return count * 2
    }
}