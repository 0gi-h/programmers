class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count = 0;
                answer += ' ';
            }
            else if(count % 2 == 0) {
                answer += Character.toUpperCase(s.charAt(i));
                count++;
            }
            else {
                answer += Character.toLowerCase(s.charAt(i));
                count++;
            }
        }
        return answer;
    }
}


/*참고할만한 풀이
//split()을 이용한 풀이
class Solution {
  public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
      return answer;
  }
}
*/
