import java.util.Stack;
import java.util.Arrays;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int idx = 0;
        int[] box = new int[4]; 
        
        for(int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if(c == '0' && i != 0 && dartResult.charAt(i-1) == 49) {
                box[idx] *= 10;
            }
            else if(48 <= c && c <= 57) {
                idx++;
                box[idx] = Character.getNumericValue(c);
            }
            else if(c == 'D'){
                box[idx] = (int)Math.pow(box[idx], 2);
            }
            else if(c == 'T'){
                box[idx] = (int)Math.pow(box[idx], 3);
            }
            else if(c == '*'){
                box[idx] *= 2;
                box[idx-1] *= 2;
            }
            else if(c == '#'){
                box[idx] *= -1;
            }
        }
        
        answer = box[1] + box[2] + box[3];
        
        return answer;
    }
}
