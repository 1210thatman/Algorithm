class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        for(ch in my_string){
            answer += ch.toString().repeat(n)
        }
        return answer
    }
}