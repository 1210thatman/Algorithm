import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.roundToInt // roundToInt()는 우리가 아는 일반적인 반올림을 수행합니다.

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val firstDay = st.nextToken().toInt()

    val st2 = StringTokenizer(readLine())
    val gg = st2.nextToken().toDouble()
    val gb = st2.nextToken().toDouble()
    val bg = st2.nextToken().toDouble()
    val bb = st2.nextToken().toDouble()

    var good = 0.0
    var bad = 0.0

    if (firstDay == 0) {
        good = 1.0
    } else {
        bad = 1.0
    }

    for (i in 1..n) {
        val nextGood = good * gg + bad * bg
        val nextBad = good * gb + bad * bb
        
        good = nextGood
        bad = nextBad
    }

    println((good * 1000).roundToInt())
    println((bad * 1000).roundToInt())
}