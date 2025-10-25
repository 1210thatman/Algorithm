fun main(){
    readln()
    val arr = readln().split(" ").toMutableList()

    // 결국 메인은 이어붙였을 때 큰 수인 것이다!!
    arr.sortWith { a, b ->
        // 두 가지 경우로 이어붙임
        val ab = a + b
        val ba = b + a

        // 문자열로 비교해서 더 큰 쪽이 앞으로
        ba.compareTo(ab)
    }

    if(arr.all { it.toInt() == 0 }){
        println(0)
    }
    else{
        print(arr.joinToString(""))
    }
}