import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> box = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(!box.contains(nums[i]) && box.size() < nums.length / 2) {
                box.add(nums[i]);
            }
        }
        answer = box.size();
        return answer;
    }
}
