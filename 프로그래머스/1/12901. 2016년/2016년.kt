class Solution {
    fun solution(a: Int, b: Int): String {
        val date = listOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
        val dateNum = (1..366).map {
            date[(it + 4) % 7]
        }
        val month = mapOf(
            1 to 31,
            2 to 29,
            3 to 31,
            4 to 30,
            5 to 31,
            6 to 30,
            7 to 31,
            8 to 31,
            9 to 30,
            10 to 31,
            11 to 30, 
            12 to 31,
        )
        
        return if (a == 1) {
            dateNum[b - 1]
        } else {
            val num: Int = (1 until a).sumOf{ month[it]!!.toInt() } + b
            dateNum[num - 1]
        }
    }
}