import java.util.*;

class Solution{
    public int solution(String s){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty() || s.charAt(i) != stack.peek()) {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == stack.peek()) {
                stack.pop();
            }
        }
        
        if(stack.isEmpty() == true){
            answer = 1;
        }

        return answer;
    }
}
