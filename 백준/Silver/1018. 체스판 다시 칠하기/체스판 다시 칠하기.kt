fun main() {
    val (x: Int, y: Int) = readln().split(" ").map { it.toInt() }
    val chessBoard: Array<IntArray> = Array(x) { IntArray(y) { 0 } }
    var min = x * y //우선 모든 체스판을 다시 칠해야 하는 경우를 가정합니다.

    for (i in 0 until x) {
        val line = readln().chunked(1) //입력받은 string을 1만큼 쪼개 list에 저장합니다.

        for (j in 0 until y) {
            if ((((i + j) % 2) == 0 && line[j] != "W" ||
                        (((i + j) % 2) != 0 && line[j] != "B"))
            ) {
                //표준 체스판 패턴에서 불일치 할 경우 chessBoard에 +1
                //짝수 번째 칸([i][j]) -> 흰색 (검은색 일때 불일치)
                //홀수 번째 칸([i][j]) -> 검은색 (흰색 일때 불일치)
                chessBoard[i][j]++ //해당 칸에 +1합니다.
            }
            if (j > 0) chessBoard[i][j] += chessBoard[i][j - 1]
            //누적합을 활용
            //현재 값(chessBoard[i][j])에는 현재 칸이 패턴과 다른지 여부
            //chessBoard[i][j] += chessBoard[i][j-1]에는
            // i열부터 j열까지 규칙과 다른 칸의 총 개수를 저장
            //누적합 사용 이유
            //나중에 8*8크기의 체스판을 찾을 때 누적합을 사용하면
            //배열을 다시 순회할 필요가 없음
        }
    }
    for (i in 0..x - 8) { // 8x8 블록의 시작 행 인덱스 (0부터 N-8까지)
        for (j in 0..y - 8) { // 8x8 블록의 시작 열 인덱스 (0부터 M-8까지)

            // 현재 8x8 블록의 불일치 횟수를 저장하는 변수
            var cnt: Int = 0

            // 8x8 블록의 8개 행을 순회하며 불일치 횟수 누적
            // k는 현재 검사하는 행의 인덱스 (i부터 i+7까지)
            for (k in i until i + 8) {

                // 1. 오른쪽 경계(j+7)까지의 불일치 누적합을 가져옴
                // chessBoard[k][j+7] = k행 0열부터 j+7열까지의 불일치 총합
                cnt += chessBoard[k][j + 7]

                // 2. 왼쪽 경계(j-1)까지의 불일치 누적합을 뺌 (j가 0이 아닐 때)
                // 이렇게 하면 k행의 j열부터 j+7열까지, 즉 8칸의 불일치 횟수만 남음
                if (j > 0) cnt -= chessBoard[k][j - 1]
            }

            // 3. 최소 수정 횟수 확정 (W로 시작 vs B로 시작)
            // cnt: 흰색(W)으로 시작하는 표준 체스판과 불일치하는 횟수
            // 64 - cnt: 검은색(B)으로 시작하는 표준 체스판과 불일치하는 횟수
            if (cnt > 64 - cnt) {
                // 검은색으로 시작하는 경우가 더 적게 수정해도 될 때, 그 값으로 cnt 갱신
                cnt = 64 - cnt
            }

            // 4. 전체 최소값 갱신
            // 현재 8x8 블록의 최소 수정 횟수(cnt)가 전체 최소값(min)보다 작으면 갱신
            if (cnt < min) {
                min = cnt
            }
        }
    }
    println(min)
}