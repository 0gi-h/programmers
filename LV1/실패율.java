import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] num = new int[N]; //머문사람
        double[] per = new double[N]; //실패율
        int sum = 0;
        int idx = 0;
        
        for(int i = 0; i < N; i++) {
            num[i] = 0;
        }
        for(int i = 0; i < stages.length; i++) {
            if(stages[i] <= N) {
                num[stages[i]-1]++;
            }
        }
        for(int i = 0; i < N; i++) {
            if(num[i] == 0) {
                per[i] = 0;
            }
            else {
                per[i] = (double)num[i] / (double)(stages.length - sum);
                sum += num[i];
            }
        }
        
        double[] per2 = Arrays.copyOf(per, per.length);
        Arrays.sort(per2);
        
        for(int j = N-1; j >= 0; j--) {
            for(int i = 0; i < N; i++) {
                if(per2[j] == per[i]) {
                    answer[idx] = i+1;
                    idx++;
                    per[i] = -1;
                }
            }
        }
        return answer;
    }
}
