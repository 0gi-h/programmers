class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                if((s.charAt(i) <= 'z' && s.charAt(i) + n > 'z') || (s.charAt(i) <= 'Z' && s.charAt(i) + n > 'Z')) {
                    answer += (char) (s.charAt(i) - 26 + n);
                }
                else {
                    answer += (char) (s.charAt(i) + n);
                }
            }
            else {
                answer += ' ';
            }
        }
        return answer;
    }
}
