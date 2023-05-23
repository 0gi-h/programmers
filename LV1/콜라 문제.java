class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a) {
            answer += b * (n / a);
            n = b * (n / a) + (n % a);
        }
        return answer;
    }
}

/*참고할만한 풀이
//
class Solution {
    public int solution(int a, int b, int n) {
        return (n > b ? n - b : 0) / (a - b) * b;
    }
}
*/
