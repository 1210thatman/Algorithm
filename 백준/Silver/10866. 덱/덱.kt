import java.util.*

fun main() {
    val n = readln().toInt()
    val deque: Deque<Int> = LinkedList()

    repeat(n) {
        val command = readln().split(" ")
        when (command[0]) {
            "push_back" -> deque.offerLast(command[1].toInt())
            "push_front" -> deque.offerFirst(command[1].toInt())
            "pop_back" -> println(deque.pollLast() ?: -1)
            "pop_front" -> println(deque.pollFirst() ?: -1)
            "front" -> println(deque.firstOrNull() ?: -1)
            "back" -> println(deque.lastOrNull() ?: -1)
            "size" -> println(deque.size)
            "empty" -> println(if (deque.isEmpty()) 1 else 0)
        }
    }
}