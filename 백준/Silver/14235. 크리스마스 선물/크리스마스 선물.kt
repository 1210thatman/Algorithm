import java.util.*

fun main() {
    val n = readln().toInt()
    val pq = PriorityQueue<Int>(Collections.reverseOrder())
    repeat(n) {
        val input = readln().trim().split(" ").map { it.toInt() }

        if (input[0] == 0) {
            println(if (pq.isEmpty()) -1 else pq.poll())
        } else {
            for (i in 1 until input.size) {
                pq.add(input[i])
            }
        }
    }
}