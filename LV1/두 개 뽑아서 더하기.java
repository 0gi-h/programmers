import java.util.*;
 
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> box = new ArrayList<>();
        int len = numbers.length;
        int tmp;
 
        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                tmp = numbers[i] + numbers[j];
                if (box.indexOf(tmp) < 0) {
                    box.add(tmp);
                }
            }
        }
 
        int answer[] = new int[box.size()];
        for(int i=0;i<answer.length; i++)
            answer[i] = box.get(i);
        Arrays.sort(answer);
        return answer;
    }
}
