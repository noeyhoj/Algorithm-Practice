import kotlin.math.abs

class Solution {
    fun position(number: Int): Pair<Int, Int> {
        return if (number == 0) {
            3 to 1
        } else {
            ((number - 1) / 3) to ((number - 1) % 3)
        }
    }
    
    fun distance(
        from: Pair<Int, Int>,
        to: Pair<Int, Int>,
    ): Int {
        return abs(from.first - to.first) + abs(from.second - to.second)
    }
    
    fun solution(numbers: IntArray, hand: String): String {
        var leftIdx = 3 to 0
        var rightIdx = 3 to 2
        
        var result = ""
        
        for (number in numbers) {
            val target = position(number)
            
            when (number) {
                1, 4, 7 -> {
                    result += "L"
                    leftIdx = target
                }
                3, 6, 9 -> {
                    result += "R"
                    rightIdx = target
                }
                else -> {
                    val leftDis = distance(leftIdx, target)
                    val rightDis = distance(rightIdx, target)
                    
                    if (leftDis < rightDis) {
                        result += "L"
                        leftIdx = target
                    } else if (leftDis > rightDis) {
                        result += "R"
                        rightIdx = target
                    } else {
                        if (hand == "right") {
                            result += "R"
                            rightIdx = target
                        } else {
                            result += "L"
                            leftIdx = target
                        }
                    }
                }
            }
        }
        
        return result
    }
}