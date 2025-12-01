fun main() {
    val str = readln()
    val arr = Array<String>(str.length) { "" }

    for(i in 0 until str.length) {
        arr[i] = str.substring(i..<str.length)
    }

    arr.sort()

    for(i in arr.indices) {
        println(arr[i])
    }
}