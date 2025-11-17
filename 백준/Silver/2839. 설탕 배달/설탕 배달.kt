import kotlin.math.min

fun main() {
    val sugar = readln().toInt()
    val dp = IntArray(sugar+1){-1}

    dp[3] = 1
    if(sugar >= 5) dp[5] = 1

    for (i in 6 .. sugar) {
        if (i % 5 == 0) dp[i] = dp[i - 5] + 1
        else if (i % 3 == 0) dp[i] = dp[i - 3] + 1
        else {
            if (dp[i-3] != -1 && dp[i-5] != -1){
                dp[i] = min(dp[i-3], dp[i-5]) + 1
            }
        }
    }
    print(dp[sugar])
}