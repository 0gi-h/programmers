class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        for(int i = 1; i < a; i++) {
            b += month[i-1];
        }
        answer = day[(b-1) % 7];
        return answer;
    }
}
