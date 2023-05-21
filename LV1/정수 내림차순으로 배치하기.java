import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String box = Long.toString(n);
        String fin = "";
        String[] tmp = box.split("");
        Arrays.sort(tmp);
        
        for(int i = 0; i < tmp.length; i++) {
            fin += tmp[tmp.length - (1+i)]; 
        }
        answer = Long.parseLong(fin);
        return answer;
    }
}
