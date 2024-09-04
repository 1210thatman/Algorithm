//조건
// 칸은 N*N으로 이루어짐
// 멈춘 위치의 가장 위에 있는 인형만 집어 올릴 수 있음
// 집어 올린 인형은 stack의 형태로 쌓임
//  같은 인형이 두 개일 경우 pop
// 삭제된 인형의 개수 return

//구현
// board[moves[x]-1][!0인 곳]의 값을 stack에 push / 그 자리를 0으로 초기화
//      if stack.peek == board[moves[x]-1][!0인 곳] 이라면 stack.pop()
//      answer++

import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int y=0; y<moves.length; y++){
            for(int x=0; x<board.length; x++){
                
                if(board[x][moves[y]-1] != 0){
                    
                    if(!stack.isEmpty() && stack.peek() == board[x][moves[y]-1]){
                        stack.pop();
                        answer++;
                        board[x][moves[y]-1] = 0;
                        break;
                    }
                    
                    else{
                        stack.push(board[x][moves[y]-1]);
                        board[x][moves[y]-1] = 0;
                        break;
                    }
                }
            }
        }
    
        return answer*2;
    }
}