fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    println(factorial(n)/(factorial(n-k)*factorial(k)))
}

fun factorial(num: Int): Int {
    val numbers =  (1..num)
    return numbers.fold(1){acc, number -> acc*number}
}