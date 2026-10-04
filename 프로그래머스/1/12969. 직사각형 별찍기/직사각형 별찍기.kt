fun main(args: Array<String>) {
    val (w, h) = readln().split(" ").map{ it.toInt() }
    repeat(h) { 
        println("*".repeat(w))
    }
}