import java.util.*

fun main() {
    val n = readln().toInt()

    val pq = PriorityQueue<Int>(Collections.reverseOrder())//정렬 기준을 내림차순으로 변경

    repeat(n) { //n번 반복
        val num = readln().toInt()
        if (num == 0) { //만약 0이라면
            if (pq.isEmpty()) { //민약 큐가 비어있다면
                println(0) //0출력
            } else { //비어있지 않다면
                println(pq.poll()) //값 제거
            }
        } else {
            pq.add(num) //정수라면 정수값 추가
        }
    }
}