import java.util.Stack

fun main() {
    val num = readln().toInt()
    val stack = Stack<String>()
    for(i in 0 until num){
        val str = readln()
        when (str[0]){
            'p' -> if(str[1] == 'u'){
                stack.push(str.split(" ")[1])
                }
                else if (stack.isEmpty()) println(-1) else println(stack.pop())
            't' -> println( if(stack.empty()) -1 else stack.peek() )
            's' -> println ( stack.size )
            'e' -> println ( if (stack.isEmpty() ) 1 else 0 )
            else -> println("뭔")
        }
    }
}