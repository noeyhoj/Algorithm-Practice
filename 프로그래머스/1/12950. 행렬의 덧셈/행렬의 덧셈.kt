class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        return Array(arr1.size) { row ->
            IntArray(arr1[0].size) { column ->
                arr1[row][column] + arr2[row][column]
            }
        }
    }
}