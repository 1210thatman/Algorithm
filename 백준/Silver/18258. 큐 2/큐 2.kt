import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val num = readln().toInt()
    val arrDeque = ArrayDeque<String>()
    repeat(num) {
        val str = br.readLine()
        when (str[0]){
            'p' -> if(str[1] == 'u') arrDeque.addLast(str.split(" ")[1])
                   else sb.appendLine(if(arrDeque.isEmpty()) -1 else arrDeque.removeFirst())
            's' -> sb.appendLine(arrDeque.size)
            'e' -> sb.appendLine(if(arrDeque.isEmpty()) 1 else 0)
            'f' -> sb.appendLine (if(arrDeque.isEmpty()) -1 else arrDeque.first())
            'b' -> sb.appendLine (if(arrDeque.isEmpty()) -1 else arrDeque.last())
        }
    }
    print(sb)
}