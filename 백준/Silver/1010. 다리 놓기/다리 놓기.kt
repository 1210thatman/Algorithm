import java.util.*
 
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
 
    val dp = Array(31){ IntArray(31) }
 
    for(i in 1 .. 30) {
        dp[i][i] = 1
        dp[i][0] = 1
    }
    for(i in 2..30) {
        for (j in 1..30) {
            dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]
        }
    }
 
    val sb = StringBuilder()
    val testCase = br.readLine().toInt()
    repeat(testCase) {
        val st = StringTokenizer(br.readLine())
        val (west, east) = arrayOf(st.nextToken().toInt(), st.nextToken().toInt())
        sb.append("${dp[east][west]}\n")
    }
 
    bw.write("$sb")
    bw.flush()
    bw.close()
    br.close()
}