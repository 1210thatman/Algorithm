fun main() {
    val t = readln().toInt()
    val dp = Array(11) { 0 }

    // 순서가 다르면 예) 4를 만들 때 1,3과 3,1은 다르다.
    // dp[i] = 정수 i를 1,2,3의 합으로 만드는 방법의 수
    // i = (i-1) 만들고 1을 더한 경우
    // i = (i-2) 만들고 2를 더한 경우
    // i = (i-3) 만들고 3을 더한 경우

    dp[1] = 1
    dp[2] = 2
    dp[3] = 4

    repeat(t) {
        val n = readln().toInt()

        for(i in 4 .. n){
            if(dp[i] == 0){
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
            }
        }

        println(dp[n])
    }
}