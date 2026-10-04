class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        val totalMoney = count.toLong() * (price.toLong() + price * count.toLong()) / 2
        return if (totalMoney > money) totalMoney - money else 0
    }
}