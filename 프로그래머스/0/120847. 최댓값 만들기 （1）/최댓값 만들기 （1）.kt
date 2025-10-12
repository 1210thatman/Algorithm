class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        numbers.sort()
        var firstMax: Int = numbers[numbers.size-1]
        var secondMax: Int = numbers[numbers.size-2]
        
        answer = firstMax * secondMax
        
        return answer
    }
}