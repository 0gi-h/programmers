class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] box = new int[n+1];
        for(int i = 2; i <= n; i++) {
            box[i] = i;
        }
        for(int i = 2, j = 2; i <= n; ) {
            if(i * j < n+1) {
                box[i * j] = 0;
                j++;
            }
            else {
                j = 2;
                i++;
            }
        }
        for(int i : box) {
            if(i != 0) {
                answer++;
            }
        }
        return answer;
    }
}
