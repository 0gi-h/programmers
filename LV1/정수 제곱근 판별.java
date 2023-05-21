class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double box = Math.sqrt(n);

        if(box % 1 == 0) {
            answer = ((long)box+1)*((long)box+1);
        }
        else {
            answer = -1;
        }
        return answer;
    }
}
