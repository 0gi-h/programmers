import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> count = new HashMap<>();
        HashMap<String, HashSet<String>> reportedUser = new HashMap<>(); 
        
        for(String s : report) {
            String[] name = s.split(" ");
            String userId = name[0];
            String reportedId = name[1];
            
            if(!reportedUser.containsKey(reportedId)) {
                reportedUser.put(reportedId, new HashSet<>());
            }
            
            reportedUser.get(reportedId).add(userId);
        }
        
        for(Map.Entry<String, HashSet<String>> entry : reportedUser.entrySet()) {
            if(entry.getValue().size() >= k) {
                for(String uid : entry.getValue()) {
                    count.put(uid, count.getOrDefault(uid, 0) + 1);
                }
            }
        }
        
        for(int i = 0; i < id_list.length; i++) {
            answer[i] = count.getOrDefault(id_list[i],0);
        }
        
        return answer;
    }
}



//참고할만한 코드
//report배열에서 중복 신고 내역을 삭제해서 리스트로 변환
List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
