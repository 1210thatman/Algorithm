fun main() {
    val N = readln().toLong()
    val arr = readln().split(" ").map { it.toLong() }.toMutableList()
    var ans = 0L

    if (N == 1L) {
        arr.sort()
        ans = arr.take(5).sum()
    } else {
        val minLists = mutableListOf<Long>()
        minLists.add(minOf(arr[0], arr[5]))
        minLists.add(minOf(arr[1], arr[4]))
        minLists.add(minOf(arr[2], arr[3]))
        minLists.sort()

        val min1 = minLists[0]
        val min2 = minLists[0] + minLists[1]
        val min3 = minLists.sum()

        val n1 = 4L * (N - 2L) * (N - 1L) + (N - 2L) * (N - 2L)
        val n2 = 4L * (N - 1L) + 4L * (N - 2L)
        val n3 = 4L

        ans += min1 * n1
        ans += min2 * n2
        ans += min3 * n3
    }

    println(ans)
}
