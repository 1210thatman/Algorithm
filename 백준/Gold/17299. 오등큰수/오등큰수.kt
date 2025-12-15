fun main() {
    readln()
    val arr = readln().split(' ').map { it.toInt() }
    val freq = MutableList(arr.max()+1) { 0 }
    val answer = MutableList(arr.size) { -1 }
    val stack = ArrayDeque<Int>()

    for (i in arr) {
        freq[i]++
    }

    arr.forEachIndexed { i, value ->
        while (!stack.isEmpty() && freq[arr[stack.last()]] < freq[value]) {
            val idx = stack.removeLast()
            answer[idx] = value
        }
        stack.addLast(i)
    }

    println(answer.joinToString(" "))
}