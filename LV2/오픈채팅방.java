import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> answer = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();

        for(String s : record) {
            String[]cmd = s.split(" ");
            if(cmd.length == 3){
                hashMap.put(cmd[1], cmd[2]);
            }
        }

        for(String s : record) {
            String[]cmd = s.split(" ");
            if(cmd[0].equals("Enter")){
                answer.add(hashMap.get(cmd[1]) + "님이 들어왔습니다.");
            }
            else if(cmd[0].equals("Leave")){
                answer.add(hashMap.get(cmd[1]) + "님이 나갔습니다.");
            }
        }

        return answer.toArray(new String[0]);
    }
}
