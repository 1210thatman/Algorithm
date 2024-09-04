// 1. stackInt를 생성한다 (Stack 활용)
// 2. arr의 길이만큼 반복문을 돌면서 stack에 arr의 값을 입력한다
//  2.1 만약 i의 값이 0이라면 stackInt에 push한다
//  2.2 만약 stackInt의 최상단 값과 현재 arr의 값이 다르다면 push한다
// 3. answer의 크기를 StackInt 만큼
// 4. return answer

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        Stack<Integer> stackInt = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(i == 0){
                stackInt.push(arr[i]);
            }
            else if(stackInt.peek() != arr[i]){
                stackInt.push(arr[i]);
            }
        }
        answer = new int[stackInt.size()];
        
        for(int i=stackInt.size()-1; i>=0; i--){
            answer[i] = stackInt.pop();
        }
        
        return answer;
    }
}