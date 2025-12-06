fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (j, n) = readln().split(" ").map { it.toInt() }

        val sizeList = mutableListOf<Int>()

        repeat(n) {
            val (r, c) = readln().split(" ").map { it.toInt() }
            sizeList.add(r * c)
        }

        sizeList.sortDescending()

        var requiredCandy = j
        var boxCount = 0

        for (size in sizeList) {
            requiredCandy -= size
            boxCount++

            if (requiredCandy <= 0) {
                break
            }
        }

        println(boxCount)
    }
}