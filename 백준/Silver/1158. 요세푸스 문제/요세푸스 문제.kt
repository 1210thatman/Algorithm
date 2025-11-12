fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val queue = ArrayDeque((1..n).toList())
    val sb = StringBuilder()
    sb.append('<')

    while (queue.isNotEmpty()) {
        repeat(k - 1) {
            queue.removeFirstOrNull()?.let { queue.addLast(it) }
            //큐에서 맨 앞 요소를 제거
            //요소가 있으면 그 값을 큐의 뒤로 추가
            //큐가 비어있으면 아무 것도 안 함
        }
        sb.append(queue.removeFirstOrNull()) //removeFirstOrNull == poll
        if (queue.isNotEmpty()) sb.append(", ")
    }

    sb.append('>')
    println(sb)
}