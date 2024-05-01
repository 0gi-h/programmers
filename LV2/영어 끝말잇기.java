import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> box = new HashSet<>();
        int[] answer = new int[]{0, 0};
        char w = words[0].charAt(0);
        
        for(int i = 0; i < words.length; i++) {
            if(box.contains(words[i]) || w != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            box.add(words[i]);
            w = words[i].charAt(words[i].length()-1);
        }

        return answer;
    }
}
