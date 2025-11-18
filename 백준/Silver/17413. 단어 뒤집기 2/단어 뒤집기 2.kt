import java.util.*

fun main() {
    val str = readln()
    val stack = Stack<Char>()
    var isAngle = false
    val result = StringBuilder()

    for (ch in str) {
        when (ch) {
            '<' -> {
                while (stack.isNotEmpty()) result.append(stack.pop())
                isAngle = true
                result.append(ch)
            }
            '>' -> {
                isAngle = false
                result.append(ch)
            }
            else -> {
                if (isAngle) {
                    result.append(ch)
                } else {
                    if (ch == ' ') {
                        while (stack.isNotEmpty()) result.append(stack.pop())
                        result.append(' ')
                    } else {
                        stack.push(ch)
                    }
                }
            }
        }
    }

    while (stack.isNotEmpty()) result.append(stack.pop())

    println(result.toString())
}