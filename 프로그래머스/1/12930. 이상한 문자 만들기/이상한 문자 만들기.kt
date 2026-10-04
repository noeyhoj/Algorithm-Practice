class Solution {
    fun solution(s: String): String {
        return s.split(" ").map { a ->
            a.indices.map { i ->
                if (i % 2 == 0) a[i].uppercase() else a[i].lowercase()
            }.joinToString("")
        }.joinToString(" ")
    }
}