fun main() {
    val n = readln().toInt()
    val queue = ArrayDeque((1..n).toList())

    while (queue.size > 1) {
        queue.removeFirst()
        queue.addLast(queue.removeFirst())
    }

    println(queue.first())
}