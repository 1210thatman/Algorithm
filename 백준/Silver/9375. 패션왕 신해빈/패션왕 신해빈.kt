fun main() {
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()
        val clothes = mutableMapOf<String, Int>()

        repeat(n) {
            val (_, category) = readln().split(" ")
            clothes[category] = clothes.getOrDefault(category, 0) + 1
        }

        var result = 1
        for (count in clothes.values) {
            result *= (count + 1)
        }

        println(result - 1)
    }
}