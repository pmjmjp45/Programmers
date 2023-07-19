import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        
        for (int i = 0; i < moves.length; i++) {//moves
            for (int j = 0; j < board.length; j++) { // board
                if (board[j][moves[i] - 1] != 0) {
                    //인형 뽑기
                    int number = board[j][moves[i] - 1];
                    board[j][moves[i] - 1] = 0;
                    
                    //인형 쌓기 & 터뜨리기
                    if (!stack.isEmpty() && stack.peek() == number) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.add(number);
                    }
                    
                    break; // 인형 뽑았으면 탈출
                }
            }
        }
        
        return answer;
    }
}