import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        boolean value = false;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < k; j++){
                if(arr[i] == answer[j]) {
                    value = false;
                    break;
                }
                value = true;
            }
            if(value == true && count < k){
                answer[count] = arr[i];
                count++;
            }
        }
        return answer;
    }
}
