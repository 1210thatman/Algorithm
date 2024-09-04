// 1. 예외처리 : s의 길이 홀수 -> 짝 안지어짐 -> false
// 2. brackets의 길이 만큼 반복
//    1. '(' -> push
//    2. ')' -> pop
//    3. ')' and stack이 비어있는가 -> return false
// 3. return stack이 비어있는가? (비어있음 - true / 비어있지 않음 - false)

import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] brackets = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        if(s.length()%2!=0){
            return false;
        }
        
        for(int i=0; i<brackets.length; i++){
            if(brackets[i] == '('){
                stack.push('(');
                continue;
            }
            if(brackets[i] == ')' && stack.isEmpty()){
                return false;
            }
            stack.pop();
        }
        return answer && stack.isEmpty();
    }
}