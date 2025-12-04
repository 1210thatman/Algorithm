fun main() {
    val s = readln() //원본 문자열 s
    val p = readln() // 복사하여 만들어야 하는 문자열 p

    var copy = 0 //몇 번 복사하였는지
    var index = 0 //문자열 p의 인덱스
    // 0. find = null, s = xy0z, p = zzz0yyy0xxx, index = 0
    // 1. find = zzz, index = 4, 이제부터 그 전 zzz는 검사할 필요가 없음

    while (index < p.length) { //인덱스가 p보다 작을 때 반복문 실행
        var match = "" //초기화, 포함하고 있는 문자열임
        var i = index //index 기준으로 뻗어나가는 또 다른 인덱스
        while (i < p.length) { //최적의 문자열을 찾자. 사가세!
            val temp = p.substring(index, i + 1) //
            if (s.contains(temp)) { //만약 원본 문자열에 쪼갠 문자열이 있다면
                match = temp //임시 문자열을 일단 저장함
                i++ //탐색 범위를 넓힘
            } else break //안되면 이제 그만 해라 스땁
        }

        copy++ //몇 번 복사한 건지 쁠쁠
        index += match.length //zzz같은 건 검사 안해도 댐
    }

    println(copy) //출력하라
}