// 현재 위치에서 현재 방향을 기준으로 왼쪽방향으로 회전
// 왼쪽 방향에 아직 방문하지 않은 육지가 있을 경우 ->
    // 해당 위치로 이동
    // 방문 횟수++
    // 회전 수 초기화
// 왼쪽으로 갈 수 없을 경우 회전하기 turn++
// 네 방향 모두 갔다면 후진
    // 후진할 위치가 바다라면 -> 종료
    // 후진 가능한 경우 -> 후진, 방향은 유지
fun main() {
    val dirY = arrayOf(-1, 0, 1, 0) // 북 동 남 서
    val dirX = arrayOf(0, 1, 0, -1) // 북 동 남 서

    val (n, m) = readln().split(' ').map { it.toInt() }
    var (y, x, d) = readln().split(' ').map { it.toInt() }

    val arr = Array(n) { IntArray(m) }

    for (i in 0 until n) {
        arr[i] = readln()
            .split(' ')
            .map { it.toInt() }
            .toIntArray()
    }

    // 현재 위치 방문 처리
    arr[y][x] = 2
    var visit = 1
    var turn = 0

    while (true) {

        // 왼쪽 방향 계산
        d = (d + 3) % 4

        val ty = y + dirY[d]
        val tx = x + dirX[d]

        // 왼쪽 방향에 아직 방문하지 않은 육지가 있는 경우
        if (arr[ty][tx] == 0) {
            y = ty
            x = tx
            arr[y][x] = 2     // 방문한 위치 체크
            visit++
            turn = 0
            continue
        }

        // 왼쪽에 갈 수 없는 경우
        else {
            turn++ //회전하기
        }

        // 네 방향 모두 방문했으면 후진
        if (turn == 4) {
            // 정 반대 방향 계산
            val backDir = (d + 2) % 4
            val by = y + dirY[backDir]
            val bx = x + dirX[backDir]

            // 후진 불가(바다) → 종료
            if (arr[by][bx] == 1) {
                break
            }

            // 후진 가능 → 이동만 함 (방향 유지)
            y = by
            x = bx
            turn = 0
        }
    }

    println(visit)
}