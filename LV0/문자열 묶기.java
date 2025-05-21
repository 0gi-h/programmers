import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        HashMap<Integer, Integer> box = new HashMap<>();
        
        for(String s : strArr) {
            box.put(s.length(), box.getOrDefault(s.length(), 0) + 1);
        }
        

        List<Integer> keySet = new ArrayList<>(box.keySet());
        // keySet.sort(new Comparator<Integer>() {
        // 	@Override
        //     public int compare(Integer o1, Integer o2) {
        //     	return box.get(o2).compareTo(box.get(o1));
        //     }
        // });
        //내림차순 정렬
        keySet.sort((o1, o2) -> box.get(o2).compareTo(box.get(o1)));
        //오름차순
        //keySet.sort((o1, o2) -> box.get(o1).compareTo(box.get(o2)));
        
        return box.get(keySet.get(0));
    }
}
