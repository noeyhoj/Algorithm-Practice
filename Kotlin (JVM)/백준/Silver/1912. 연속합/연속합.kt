fun main() {
    val n = readln().toInt()
    val nList = readln().split(" ").map{ it.toInt() }

    val nArray = IntArray(n)
    nArray[0] = nList[0]
    var maxNum = nList[0]

    for (i in 1 until n) {
        nArray[i] = maxOf(nArray[i - 1] + nList[i], nList[i])
        maxNum = maxOf(maxNum, nArray[i])
    }

    println(maxNum)
}