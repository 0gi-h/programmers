class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0 ; i < phone_number.length(); i++) {
            if(i < phone_number.length()-4)
                answer = answer + "*";
            else
                answer = answer + phone_number.charAt(i);
        }
        return answer;
    }
}

/*참고할만한 풀이
//정규식을 이용한 풀이
class Solution {
  public String solution(String phone_number) {
    return phone_number.replaceAll(".(?=.{4})", "*"); // .(?=.{4}) ==> 뒤쪽에서 임의의 문자 4개를 제외한 임의의 문자 한 개 선택
  }
}

//위 코드를 간결하게
class Solution {
  public String solution(String phone_number) {
      String answer = "";

        for (int i = 0; i < phone_number.length() - 4; i++)
            answer += "*";

        answer += phone_number.substring(phone_number.length() - 4);

        return answer;
  }
}
*/
