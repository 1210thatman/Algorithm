fun main() {
    val n = readln().toInt()
    val map = mutableMapOf<String, Boolean>()

    repeat(n) {
        val (name, status) = readln().split(" ")

        if (status == "enter") map[name] = true
        else map.remove(name)
    }

    map.keys
        .sortedDescending()
        .forEach { println(it) }
}