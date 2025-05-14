import java.util.*;
import java.util.stream.*; //필수 임포트

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        String tmp = "";
        
        //스트림의 변환 메서드는 List인터페이스에서 구현되어 있기 때문에 ArrayList가 아닌 List로 선언
        List<Integer> box = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        
        answer = box.contains(n) ? 1 : 0;
        
        return answer;
    }
}
