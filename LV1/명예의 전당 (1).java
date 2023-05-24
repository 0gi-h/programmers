import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] box = new int[k];
        Arrays.fill(box, 2001);
        for(int i = 0; i < score.length; i++) {
            if(i < k) {
                box[i] = score[i];
                Arrays.sort(box);
                answer[i] = box[0];
            }
            else if(box[0] < score[i]) {
                box[0] = score[i];
                Arrays.sort(box);
                answer[i] = box[0];
            }
            else {
                answer[i] = box[0];
            }
        }
        return answer;
    }
}
