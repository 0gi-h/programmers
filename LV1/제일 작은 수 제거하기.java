import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>(arr.length);
        for (int i : arr) {
            if(arr.length-1 == 0) {
                answer.add(-1);
                break;
            }
            answer.add(i);
        }
        if(answer.get(0) != -1) {
            Arrays.sort(arr);
            int tmp = arr[0];
            answer.remove(answer.indexOf(tmp));
        }

        return answer;
    }
}

/*참고할만한 풀이
//배열을 이용한 풀이
class Solution {
  public int[] solution(int[] arr) {
      if(arr.length == 1){
          int[] answer = {-1};
          return answer;
      }

      int[] answer = new int[arr.length-1];
      int minIndex=0;

      for(int i=0;i<arr.length;i++){
          if(arr[minIndex]>arr[i]){
              minIndex = i;
          }
      }
      for(int i=minIndex+1;i<arr.length;i++){
          arr[i-1] = arr[i];
      }
      for(int i=0;i<answer.length;i++){
          answer[i] = arr[i];
      }
      return answer;
  }
}
*/
