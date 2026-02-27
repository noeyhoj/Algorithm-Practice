fun main() {
    repeat(readln().toInt()) {
        val fibonacci = Array(size = 41, init = { Pair(0, 0) })
        fibonacci[0] = Pair(1, 0)
        fibonacci[1] = Pair(0, 1)
        for (i in 2..40) {
            fibonacci[i] = Pair(fibonacci[i - 1].first + fibonacci[i - 2].first , fibonacci[i - 1].second + fibonacci[i - 2].second)
        }

        val n = readln().toInt()

        println("${fibonacci[n].first} ${fibonacci[n].second}")
    }
}

// 점화식
// f(0) = -> 1, 0
// f(1) = -> 0, 1
// f(2) = f(1) + f(0) -> 1, 1
// f(3) = f(2) + f(1) -> 1, 2
// f(4) = f(3) + f(2) -> 2, 3
// ...
// f(n) = Pair(f(n - 1).first + f(n - 2).first, f(n - 1).second + f(n - 2).second)