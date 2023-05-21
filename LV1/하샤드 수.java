class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        String num = Integer.toString(x);
        for(int i = 0; i < num.length();i++) {
            sum += Character.getNumericValue(num.charAt(i));
        }
        if(x % sum == 0) {
            answer = true;
        }
        return answer;
    }
}
