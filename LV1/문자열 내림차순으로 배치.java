import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] box = new char[s.length()];
        for(int i = 0; i < s.length(); i++) {
            box[i] = s.charAt(i);
        }
        Arrays.sort(box);
        for(int i = s.length()-1; i >= 0 ; i--) {
            answer += box[i];
        }
        return answer;
    }
}
