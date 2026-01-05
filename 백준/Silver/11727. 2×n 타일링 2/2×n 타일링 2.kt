fun main() {
    val input = readLine()!!.toInt()
    val dp = IntArray(1001) { _ -> 0}
    dp[1] = 1
    dp[2] = 3
    for (i in 3..input) {
        dp[i] = (2 * dp[i-2] + dp[i-1]) % 10007
    }
    print(dp[input])
}