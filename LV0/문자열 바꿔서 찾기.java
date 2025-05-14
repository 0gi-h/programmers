import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String tmp = "";
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'A') {
                tmp += "B";
            }
            else {
                tmp += "A";
            }
        }
        
        // if(tmp.replace(pat, "").length() < myString.length()) {
        //     answer = 1;
        // } 
        
        answer = tmp.contains(pat) ? 1 : 0;
        
        return answer;
    }
}
