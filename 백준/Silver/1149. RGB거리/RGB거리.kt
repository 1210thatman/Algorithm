import kotlin.math.min

fun main() {
    val n = readln().toInt()

    // dp[i][0] = i번 집을 R로 칠한 최소 비용
    // dp[i][1] = i번 집을 G로 칠한 최소 비용
    // dp[i][2] = i번 집을 B로 칠한 최소 비용
    val dp = Array(n) { IntArray(3) }

    for (i in 0 until n) {
        val (r, g, b) = readln().split(" ").map { it.toInt() }

        if (i == 0) {
            dp[i][0] = r
            dp[i][1] = g
            dp[i][2] = b
        } else {
            dp[i][0] = min(dp[i - 1][1], dp[i - 1][2]) + r

            dp[i][1] = min(dp[i - 1][0], dp[i - 1][2]) + g

            dp[i][2] = min(dp[i - 1][0], dp[i - 1][1]) + b
        }
    }

    println(min(dp[n - 1][0], min(dp[n - 1][1], dp[n - 1][2])))
}