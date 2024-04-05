import java.util.Arrays;
import java.util.Stack;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        Stack<Integer> stack = new Stack<>();
        //각 행별 위, 아래 위치 저장할 배열, 맨위와 맨아래를 고려해 n보다 2크게 생성
        int[] up = new int[n+2];
        int[] down = new int[n+2];

        for(int i = 0; i < n + 2; i++){ //초기 위, 아래 행 대입
            up[i] = i - 1;
            down[i] = i + 1;
        }

        k++; //맨위 가상 공간이 있으므로 k+1 

        for(String c : cmd){
            if(c.startsWith("C")){
                stack.push(k);
                up[down[k]] = up[k]; //삭제된 행의 아래 행의 위 행을 삭제된 행의 위 행으로 수정
                down[up[k]] = down[k]; //삭제된 행의 위 행의 아래 행을 삭제된 행의 아래 행으로 수정
                k = n < down[k] ? up[k] : down[k]; //삭제된 행이 맨 아래 행일 경우 k는 위 행을 가르킴
            }
            else if(c.startsWith("Z")){
                int restore = stack.pop();
                down[up[restore]] = restore; //복구된 행의 위 행의 아래행을 복구된 행으로 수정
                up[down[restore]] = restore; //복구된 행의 아래 행의 위행을 복구된 행으로 수정
            }
            else{
                String[] s = c.split(" ");
                int x = Integer.parseInt(s[1]);
                for(int i = 0; i < x; i++){
                    k = s[0].equals("U") ? up[k] : down[k]; //이동 값을 up, down배열을 통해 이동, 연결리스트를 생각하면 됨
                }
            }
        }

        char[] answer = new char[n];
        Arrays.fill(answer, 'O');

        for(int i : stack) {
            answer[i-1] = 'X';
        }

        return new String(answer);
    }
}
