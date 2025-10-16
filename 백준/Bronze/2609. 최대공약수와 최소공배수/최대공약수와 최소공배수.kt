fun main() {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }

    val gcd = gcd(a,b)
    val lcm = (a * b) / gcd

    println(gcd)
    println(lcm)
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0){
        a
    }
    else
        gcd(b, a % b)
}