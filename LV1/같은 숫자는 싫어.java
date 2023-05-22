import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int count = arr.length;
        int idx = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]) {
                arr[i] = -1;
                count--;
            }
        }
        int[] answer = new int[count];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != -1) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");

        return answer;
    }
}
