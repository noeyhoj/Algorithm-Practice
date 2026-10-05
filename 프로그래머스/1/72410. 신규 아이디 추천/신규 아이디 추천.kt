class Solution {
    fun solution(new_id: String): String {
        // 1단계
        var result = new_id.map {
            if (it.isUpperCase()) it.lowercase() else it
        }.joinToString("")
        
        // 2단계
        result = result.filter { 
            it == '-' || 
            it == '_' || 
            it == '.' || 
            it in ('a'..'z') || 
            it in ('0'..'9') 
        }
        
        // 3단계
        result = result.replace(Regex("\\.+"), ".")

        // 4단계
        result = result.trim('.')
        
        // 5단계
        if (result.isEmpty()) {
            result += 'a'
        }
        
        // 6단계
        result = result.take(15).trimEnd('.')
        
        // 7단계
        if (result.length < 3) {
            result = result + result.last().toString().repeat(3 - result.length)
        }
        
        return result
    }
}