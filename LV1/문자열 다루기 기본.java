class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        for(int i = 0; i < s.length(); i++) {
            if(s.length() == 4 || s.length() == 6) {
                if(s.charAt(i) > 58) {
                    answer = false;
                    break;
                }
            }
            else {
                answer = false;
                break;
            }
        }
        return answer;
    }
}

/*참고할만한 풀이
//try catch를 이용한 풀이
class Solution {
  public boolean solution(String s) {
      if(s.length() == 4 || s.length() == 6){
          try{
              int x = Integer.parseInt(s);
              return true;
          } catch(NumberFormatException e){
              return false;
          }
      }
      else return false;
  }
}

*/
