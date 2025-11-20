fun lowerBound(arr: IntArray, target: Int): Int {
    var left = 0
    var right = arr.size
    while (left < right) {
        val mid = (left + right) / 2
        if (arr[mid] < target) left = mid + 1
        else right = mid
    }
    return left
}

fun upperBound(arr: IntArray, target: Int): Int {
    var left = 0
    var right = arr.size
    while (left < right) {
        val mid = (left + right) / 2
        if (arr[mid] <= target) left = mid + 1
        else right = mid
    }
    return left
}

fun main() {
    readln()
    val cards = readln().split(" ").map { it.toInt() }.toIntArray()
    cards.sort()  // IntArray 자체 메서드
    readln()
    val sangCards = readln().split(" ").map { it.toInt() }

    val sb = StringBuilder()
    for (target in sangCards) {
        val count = upperBound(cards, target) - lowerBound(cards, target)
        sb.append(count).append(" ")
    }
    println(sb)
}