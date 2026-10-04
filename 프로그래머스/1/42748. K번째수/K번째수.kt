class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val result = commands.map { command ->
            val arr = array.toList().slice(command[0] - 1 until command[1]).sorted()
            arr[command[2] - 1]
        }
        return result.toIntArray()
    }
}
