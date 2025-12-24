fun main() {
    val (n, s) = readln().split(" ").map { it.toInt() }
    val arr = readln().split(" ").map { it.toInt() }

    val result = mutableListOf<Int>()
    var answer = 0

    fun makeCombination(cnt: Int, start: Int) {
        if (cnt > 0 && result.sum() == s) { //모든 요소를 더했을 때 N이 나올경우 answer쁠쁠
            answer++
        }

        if (cnt == n) {
            return
        }

        for (cur in start until n) {
            result.add(arr[cur])
            makeCombination(cnt + 1, cur + 1)
            result.removeAt(result.lastIndex)
        }
    }

    makeCombination(0, 0)
    println(answer)
}