fun main() {
    readln()
    val arr = readln().split(" ").map { it.toInt() }
    val answer = MutableList(arr.size) { -1 }
    val stack = ArrayDeque<Int>()  

    arr.forEachIndexed { i, value ->
        while (stack.isNotEmpty() && arr[stack.last()] < value) {
            val idx = stack.removeLast()
            answer[idx] = value
        }
        stack.addLast(i)
    }

    println(answer.joinToString(" "))
}
