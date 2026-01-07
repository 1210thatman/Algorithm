import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m, r) = readLine().split(" ").map { it.toInt() }
    val tree = Array<MutableList<Int>>(n + 1) { mutableListOf() }
    val visited = IntArray(n + 1)

    repeat(m) {
        val (u, v) = readLine().split(" ").map { it.toInt() }
        tree[u].add(v)
        tree[v].add(u)
    }

    // 오름차순 정렬, 작은 정점부터 방문하기 위해
    tree.forEach { it.sort() }

    dfs(r, visited, tree)

    for (i in 1..n) {
        bw.appendLine(visited[i].toString())
    }

    bw.flush()
    bw.close()
}

fun dfs(
    start: Int,
    visited: IntArray,
    tree: Array<MutableList<Int>>
) {
    val stack = Stack<Int>()
    var order = 1

    stack.push(start)

    while (stack.isNotEmpty()) {
        val node = stack.pop()

        if (visited[node] != 0) continue

        visited[node] = order++

        //역순으로 push
        for (i in tree[node].size - 1 downTo 0) {
            val next = tree[node][i]
            if (visited[next] == 0) {
                stack.push(next)
            }
        }
    }
}