import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        for(int i : arr) {
            if(i % divisor == 0)
                answer.add(i);
        }
        if(answer.size() == 0) {
            answer.add(-1);
        }
        return answer;
    }
}
