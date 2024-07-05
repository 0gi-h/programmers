class Solution {
    public int solution(String s) {
        int answer = 1;
        int x = 0;
        int y = 0;
        char a = s.charAt(0);
        
        for(int i = 0; i < s.length(); i++) {
            if(a == s.charAt(i)){
                x++;
            }
            else {
                y++;
            }
            
            if(x == y && i < s.length()-1) {
                answer++;
                x = 0;
                y = 0;
                a = s.charAt(i + 1);
            }
        }
        
        return answer;
    }
}
