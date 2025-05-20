import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0 ; i < flag.length; i++) {
            if(flag[i]) {
                for(int j = 0 ; j < arr[i] * 2; j++) {
                    stack.push(arr[i]);
                }
            }
            else{
                for(int j = 0 ; j < arr[i]; j++) {
                    stack.pop();
                }
            }
        }

        //스택을 배열로 변환
        answer = stack.stream().mapToInt(Integer::intValue).toArray();

        //현재 길이보다 더 많은 원소를 제거하는 경우
        // for(int i = 0; i < arr.length; i++) {
        //     if(flag[i] == true) {
        //         for(int j = 0; j < arr[i] * 2; j++) {
        //             answer.add(arr[i]);
        //         }
        //     }
        //     else if(answer.size() > 0){
        //         for(int j = 1; j <= arr[i]; j++) {
        //             answer.remove(answer.size() - 1);
        //             if(answer.size() == 0) {
        //                 break;
        //             }
        //         }
        //     }
        // }
        
        
        return answer;
    }
}
