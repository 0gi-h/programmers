class Solution {
    public String solution(int[] food) {
        String answer = "";
        String box = "";
        for(int i = 1; i < food.length; i++) {
            if(food[i] > 1) {
                for(int j = 0; j < food[i] / 2; j++) {
                    answer += i;
                    box = i + box;
                }
            }
        }
        answer = answer + 0 + box;
        return answer;
    }
}

/*
//위의 코드를 더 간결하게 
class Solution {
    public String solution(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i; 
            }
        }

        return answer;
    }
}
*/
