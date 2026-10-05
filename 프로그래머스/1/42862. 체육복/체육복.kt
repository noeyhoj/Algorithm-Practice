class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val newLost = lost.filter { !reserve.contains(it) }.sorted()
        val newReserve = reserve.filter { !lost.contains(it) }.sorted().toMutableList()
        var count = n - newLost.size
        
        newLost.forEach { people ->
            if (newReserve.contains(people - 1)) {
                newReserve.remove(people - 1)
                count++
            } else if (newReserve.contains(people + 1)) {
                newReserve.remove(people + 1)
                count++
            }
        }
        return count
    }
}