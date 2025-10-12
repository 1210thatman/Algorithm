class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0
        for(h in array){
            if(h > height) answer += 1; 
        }
        return answer
    }
}