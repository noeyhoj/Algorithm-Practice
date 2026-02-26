import kotlin.math.max

fun main() {
    val n = readln().toInt()
    val nList = readln().split(" ").map{ it.toInt() }

    val dp = IntArray(n)
    dp[0] = nList[0]
    var maxNum = dp[0]

    for (i in 1 until n) {
        dp[i] = max(nList[i], dp[i - 1] + nList[i])
        maxNum = max(dp[i], maxNum)
    }

    println(maxNum)
}