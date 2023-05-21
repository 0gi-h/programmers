class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int tmp = a;
        if(a > b) {
            a = b;
            b = tmp;
        }
        for(int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}


/* 참고할만한 풀이 
//위의 코드와 유사하나 더 간결
class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) 
          answer += i;

      return answer;
  }
}

//등차수열의 합 공식을 이용한 코드
class Solution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
*/
