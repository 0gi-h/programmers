import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> wantMap = new HashMap<>();
        
        for(int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        for(int i = 0; i < discount.length - 9; i++){
            HashMap<String, Integer> d_10d = new HashMap<>();
            
            for(int j = i; j < i + 10; j++){
                if(wantMap.containsKey(discount[j])){
                    d_10d.put(discount[j], d_10d.getOrDefault(discount[j], 0) + 1);
                }
            }
            if(d_10d.equals(wantMap))
                answer++;
        }
        return answer;
    }
}
