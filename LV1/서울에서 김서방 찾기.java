import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}
//이진탐색을 하면 안되는 이유 - 정렬을 하면 기존의 인덱스 값이 바뀌기 때문

/*참고할만한 코드
//라이브러리를 이용한 코드 -> 다만 ArrayList 메모리 할당으로 비효율적
import java.util.Arrays;

public class FindKim {
    public String findKim(String[] seoul){
        int x = Arrays.asList(seoul).indexOf("Kim");        
        return "김서방은 "+ x + "에 있다";
    }
 }
*/
