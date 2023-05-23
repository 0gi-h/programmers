import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] box = {0,0};
        for(int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            box[0] = Math.max(sizes[i][0], box[0]);
            box[1] = Math.max(sizes[i][1], box[1]);
        }
        answer = box[0] * box[1];
        return answer;
    }
}
