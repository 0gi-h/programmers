class Solution {
    public int solution(int n) {
        int answer = 0;
        String box = "";
        while(n != 0) {
            box += String.valueOf(n % 3);
            n = n / 3;  
        }
      for(int i = 0; i < box.length(); i++) {
          answer += Character.getNumericValue(box.charAt(box.length()-i-1)) * Math.pow(3, i);
      }  
        return answer;
    }
}
