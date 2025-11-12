fun main() {
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }

    val stack = ArrayDeque<Int>()
    var index = 1
    var result = "Nice"

    for (num in nums) {
        if (index != num) {
            while (stack.isNotEmpty() && stack.last() == index) {
                stack.removeLast()
                index++
            }
            stack.addLast(num)
        } else {
            index++
        }
    }

    while (stack.isNotEmpty()) {
        if (stack.removeLast() == index) {
            index++
        } else {
            result = "Sad"
            break
        }
    }

    println(result)
}