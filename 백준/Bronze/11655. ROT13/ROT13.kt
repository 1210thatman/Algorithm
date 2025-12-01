fun main() {
    val str = readln()
    val sb = StringBuilder(str)

    for (i in sb.indices) {
        if (str[i].isUpperCase()) {
            sb[i] = ((str[i].code - 'A'.code + 13) % 26 + 'A'.code).toChar()
        }
        else if(str[i].isLowerCase()) {
            sb[i] = ((str[i].code - 'a'.code + 13) % 26 + 'a'.code).toChar()
        }
    }

    println(sb.toString())
}