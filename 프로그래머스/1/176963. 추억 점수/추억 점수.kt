class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val answer = name.indices.associate {
            name[it] to yearning[it]
        }
        
        return photo.toList().map { pho ->
            pho.toList().map { name ->
                answer[name]?.toString() ?: "0"
            }.sumOf{ it.toInt() }
        }.toIntArray()
    }
}