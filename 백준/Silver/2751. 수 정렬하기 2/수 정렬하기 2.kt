package studyKotlin

fun main() {
    readln()
    val arr = generateSequence(::readlnOrNull)
        .takeWhile { it.isNotBlank() }
        .map { it.toInt() }
        .toMutableList()

    arr.sort()

    print(arr.joinToString("\n"))
}