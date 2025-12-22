import kotlin.math.max

fun main() {
    val n = readln().toInt()
    val arr = IntArray(n+1)
    for (i in 1 .. n) {
        arr[i] = readln().toInt()
    }

    if(n == 1){
        println(arr[1])
        return
    }

    val dp =  IntArray(n+1)
    dp[1] = arr[1]
    dp[2] = arr[2] + dp[1];

    for(i in 3 .. n) {
        //세 계단 전에서 연속된 두 계단을 밟고 오는 경우, 두 계단 전에서 오는 경우
        dp[i] = max(dp[i-3] + arr[i-1],dp[i-2]) + arr[i]
    }
    val answer = dp[n]
    println(answer)
}