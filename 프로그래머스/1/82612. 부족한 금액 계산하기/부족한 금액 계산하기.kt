class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        val totalMoney = (1..count).sumOf { it.toLong() } * price.toLong()
        return if (totalMoney > money) totalMoney - money else 0
    }
}