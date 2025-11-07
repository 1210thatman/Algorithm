fun main() {
    val isbn: String = readln()

    val missingIndex = isbn.indexOf('*')

    val weights = List(isbn.length) { if (it % 2 == 0) 1 else 3 }

    val totalSum = isbn.mapIndexedNotNull { index, char ->
        if (char != '*') {
            char.digitToInt() * weights[index]
        } else {
            null
        }
    }.sum()

    val targetWeight = weights[missingIndex]

    for (i in 0..9) {
        val finalSum = totalSum + (i * targetWeight)

        if (finalSum % 10 == 0) {
            println(i)
            break
        }
    }
}