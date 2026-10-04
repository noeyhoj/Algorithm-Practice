class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val result = commands.map { command ->
            if (command[0] == command[1]) {
                array[command[0] - 1]
            } else {
                val arr = array.toList().slice(command[0] - 1 until command[1]).sorted()
                arr[command[2] - 1]
            }
        }
        return result.toIntArray()
    }
}
