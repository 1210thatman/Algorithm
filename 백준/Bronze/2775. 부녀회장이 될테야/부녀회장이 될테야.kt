package studyKotlin

fun main(){
    val t = readln()!!.toInt()
    val dp = Array(15){Array(15){0}}

    for(i in 0 until 15){
        for(j in 0 until 15){
            if(i == 0 || j == 0) dp[i][j] = j + 1
            else dp[i][j] = dp[i-1][j] + dp[i][j-1]
        }
    }

    for(i in 0 until t){
        val k = readln()!!.toInt()
        val n = readln()!!.toInt()
        println(dp[k][n-1])
    }
}