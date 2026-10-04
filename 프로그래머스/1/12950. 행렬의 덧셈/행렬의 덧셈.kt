class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val row = arr1.size
        val column = arr1[0].size
        
        val result = mutableListOf<IntArray>()
        
        for (i in 0 until row) {
            val arr = mutableListOf<Int>()
            for (j in 0 until column) {
                arr.add(arr1[i][j] + arr2[i][j])
            }
            result.add(arr.toIntArray())
        }
        
        return result.toTypedArray()
    }
}