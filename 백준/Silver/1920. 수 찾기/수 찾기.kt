fun main() {
    readln()
    val arr1 = readln().split(" ").map { it.toInt() }.toSet() // 탐색 효율을 위해 Set 사용
    readln()
    val arr2 = readln().split(" ").map { it.toInt() }

    arr2.forEach { number ->
        println(if (number in arr1) 1 else 0)
    }
}