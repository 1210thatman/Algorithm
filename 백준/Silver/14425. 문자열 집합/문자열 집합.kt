fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val set = HashSet<String>()
    repeat(n) { set.add(readln()) }

    var count = 0
    repeat(m) {
        val query = readln()
        if (set.contains(query)) count++
    }

    println(count)
}