class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i = 0; i < targets.length; i++) {
            for(int j = 0; j < targets[i].length(); j++) {
                int n = 101;
                for(int k = 0; k < keymap.length; k++) {
                    if(keymap[k].indexOf(targets[i].charAt(j)) == -1) {
                        continue;
                    }
                    else if(keymap[k].indexOf(targets[i].charAt(j)) != -1) {
                        n = n < keymap[k].indexOf(targets[i].charAt(j)) + 1 ? n : keymap[k].indexOf(targets[i].charAt(j)) + 1;
                    }
                }

                if(n == 101) {
                    answer[i] = -1;

                    //처음엔 continue를 했는데 그렇게 하게되면 한글자가 안되어도 다음 글자로 넘어가게 된다
                    //break를 해야 한 글자가 안되면 -1을 넣고 다음 타겟으로 넘어가게 된다.
                    break;
                }
                answer[i] += n;
            }
            
        }
        
        return answer;
    }
}
