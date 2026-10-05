class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var mmap = mutableMapOf(
            "R" to 0,
            "T" to 0,
            "C" to 0,
            "F" to 0,
            "J" to 0,
            "M" to 0,
            "A" to 0,
            "N" to 0,
        )
        for (idx in choices.indices) {
            val bad = survey[idx][0]
            val good = survey[idx][1]
            
            val choice = choices[idx]
            
            if (choice < 4) {
                mmap[bad.toString()] = mmap[bad.toString()]!! + (4 - choice)
            } else {
                mmap[good.toString()] = mmap[good.toString()]!! + (choice - 4)
            } 
        }
        val first = if (mmap["R"]!! >= mmap["T"]!!) "R" else "T"
        val second = if (mmap["C"]!! >= mmap["F"]!!) "C" else "F"
        val third = if (mmap["J"]!! >= mmap["M"]!!) "J" else "M"
        val fourth = if (mmap["A"]!! >= mmap["N"]!!) "A" else "N"
        return first + second + third + fourth
    }
}