fun main() {
    val num:Int = readln().toInt()
    repeat(num) {
        val (a, b) = readln().split(",").map { it.toInt() }
        println(a+b)
    }
}