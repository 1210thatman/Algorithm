fun main() {
    val num = readln().toInt()
    repeat(num) {
        readln().split(" ").map { it.reversed() }.forEach { print("$it ") }
        println()
    }
}