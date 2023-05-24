import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i = 0; i < score.length/m; i++) {
            answer += score[score.length - (m*(i+1))] * m; 
        }
        return answer;
    }
}


/*참고할만한 풀이
//위의 코드를 더 효율적으로 바꿈
import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i = score.length-m; i >= 0; i-=m) {
            answer += score[i]*m;
        }

        return answer;
    }
}
*/
