import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = moves.length;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < moves.length; i++) {
            int j = 0;
            while(true){
                if(stack.isEmpty() && board[j][moves[i]-1] != 0){
                    stack.push(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }
                else if(!stack.isEmpty() && board[j][moves[i]-1] == stack.peek()){
                    stack.pop();
                    board[j][moves[i]-1] = 0;
                    break;
                }
                else if(board[j][moves[i]-1] != 0){
                    stack.push(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }
                else{
                    if(board[board.length-1][moves[i]-1] == 0){
                        answer--;
                        break;
                    }
                    j++;
                }
            }
        }
        answer = answer - stack.size();
        
        return answer;
    }
}
