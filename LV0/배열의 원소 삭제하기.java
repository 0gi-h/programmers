import java.util.*;
import java.util.stream.*;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        
        List<Integer> box = Arrays.stream(arr).boxed().collect(Collectors.toList());

        //remove(int)이면 인덱스로 인식, Integer로 해줘야 특정 값을 지울 수 있다.
        for(Integer n : delete_list) {
            box.remove(n);    
        }
        
        
        return box;
    }
}
