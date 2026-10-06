class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val nameToScore = name.indices.associate {
            name[it] to yearning[it]
        }
        
        return photo.map { person ->
            person.sumOf { people ->
                nameToScore[people] ?: 0
            }
        }.toIntArray()
    }
}