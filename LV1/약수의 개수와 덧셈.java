class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i < right + 1; i++) {
            int count = 0;
            for (int j = 1; j < i + 1; j++) {
                if(i % j == 0) count++;
            }
            if (count % 2 == 0) {
                answer += i;
            } else { 
                answer -= i; 
            }
        }
        return answer;
    }
}

/*참고할만한 코드
//수학적 접근
class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}
*/
