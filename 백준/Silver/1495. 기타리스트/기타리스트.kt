fun main() {
    val (n, s, m) = readln().split(' ').map { it.toInt() }
    val range = readln().split(' ').map { it.toInt() }
    val dp = Array(n+1) { mutableSetOf<Int>() }

    dp[0].add(s)

    for (i in 1..n) {
        for (prevVolume in dp[i-1]) {
            if (prevVolume - range[i-1] >= 0) {
                dp[i].add(prevVolume - range[i-1])
            }
            if (prevVolume + range[i-1] <= m) {
                dp[i].add(prevVolume + range[i-1])
            }
        }
    }

    if (dp[n].isEmpty()) {
        println(-1)
    } else {
        println(dp[n].max())
    }
}