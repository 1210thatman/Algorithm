import kotlin.math.*
 
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
 
    val testCase = br.readLine().toInt()
 
    repeat(testCase) {
        val line = br.readLine().split(' ').map { it.toDouble() }
        val (x1, y1, r1) = arrayOf(line[0], line[1], line[2])
        val (x2, y2, r2) = arrayOf(line[3], line[4], line[5])
 
        val ans = if(x1 == x2 && y1 == y2) {
            if(r1 == r2) -1
            else 0
        } else {
            val d1 = sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2))
            val d2 = (r1 + r2)
            val d3 = abs(r1 - r2)
 
            if(d1 > d2 || d1 < d3) 0
            else if(d1 == d2 || d1 == d3) 1
            else 2
        }
 
        bw.append("$ans\n")
    }
 
    bw.write("")
    bw.flush()
    bw.close()
    br.close()
}