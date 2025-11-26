fun main() {
    val (n,m) = readln().split(" ").map {  it.toInt() }
    val nameMap = hashMapOf<String, Int>()
    val numMap = hashMapOf<Int, String>()

    for (i in 1..n) {
        val name = readln()
        nameMap[name] = i
        numMap[i] = name
    }

    repeat(m) {
        val question = readln()
        if (question[0].isDigit()) {
            println(numMap[question.toInt()])
        }
        else {
            println(nameMap[question])
        }
    }
}