class Solution {
    public int[] solution(String myString) {
        //split(String regex, int limit)
        //limit가 -1이면 마지막 요소가 빈문자열일 경우 포함
        //String[] tmp = myString.split("x", -1);
        String[] tmp = myString.split("x");
        int[] answer = {};
        
        if(myString.charAt(myString.length() - 1) == 'x') {
            answer = new int[tmp.length + 1];
        }
        else {
            answer = new int[tmp.length];
        }
  
        for(int i = 0; i < tmp.length; i++) {
            answer[i] = tmp[i].length();
        }
        
        return answer;
    }
}
