import java.util.*

fun main() {
    val left = Stack<Char>()
    val right = Stack<Char>()

    val input = readln()
    input.forEach { left.push(it) }

    val n = readln().toInt()

    repeat(n) {
        val command = readln().split(" ")
        when (command[0]) {
            "L" -> if (left.isNotEmpty()) right.push(left.pop())
            "D" -> if (right.isNotEmpty()) left.push(right.pop())
            "B" -> if (left.isNotEmpty()) left.pop()
            "P" -> left.push(command[1][0])
        }
    }

    val sb = StringBuilder()
    while (left.isNotEmpty()) sb.append(left.pop())
    sb.reverse()
    while (right.isNotEmpty()) sb.append(right.pop())
    println(sb)
}