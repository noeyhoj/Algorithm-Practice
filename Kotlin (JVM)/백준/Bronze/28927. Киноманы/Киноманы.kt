fun main() {
    val (a, b, c) = readln().split(" ").map{ it.toInt() }
    val (d, e, f) = readln().split(" ").map{ it.toInt() }
    when {
        (a * 3 + b * 20 + c * 120) > (d * 3 + e * 20 + f * 120) -> println("Max")
        (a * 3 + b * 20 + c * 120) < (d * 3 + e * 20 + f * 120) -> println("Mel")
        else -> println("Draw")
    }
}