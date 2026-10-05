class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val result = IntArray(targets.size) { 0 }
        for (idx in targets.indices) {
            var count = 0
            for (key in targets[idx]) {
                val res = keymap.map { it.indexOf(key) }.filter { it != -1 }
                if (res.all{ it == -1 }) {
                    count = -1
                    break
                }
                val min = res.minOf{ it }
                count += (min + 1)
            }
            result[idx] = count
        }
        return result
    }
}