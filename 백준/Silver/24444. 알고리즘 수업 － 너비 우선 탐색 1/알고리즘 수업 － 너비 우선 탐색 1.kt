import java.io.StreamTokenizer
import java.util.PriorityQueue
import java.util.ArrayDeque

fun main() = StreamTokenizer(System.`in`.bufferedReader()).run {
    fun read() : Int {
        nextToken()
        return nval.toInt()
    }

    val N = read()
    val M = read()
    val R = read()
    val graph = Array(N + 1) { PriorityQueue<Int>() }
    val visited = BooleanArray(N + 1)
    val orders = IntArray(N + 1)
    var order = 0
    val q = ArrayDeque<Int>()


    repeat(M) {
        val u = read()
        val v = read()
        graph[u].add(v)
        graph[v].add(u)
    }

    fun BFS(node: Int) {
        visited[node] = true
        orders[node] = ++order
        q.add(node)

        while (q.isNotEmpty()) {
            val from = q.poll()

            while (graph[from].isNotEmpty()) {
                val to = graph[from].poll()
                if (!visited[to]) {
                    visited[to] = true
                    orders[to] = ++order
                    q.add(to)
                }
            }
        }
    }

    BFS(R)

    val sb = StringBuilder()
    for (i in 1 .. N)
        sb.append(orders[i]).append('\n')
    println(sb)
}