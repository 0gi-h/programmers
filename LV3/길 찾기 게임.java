import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    private static class Node { //노드별 좌표와 nodeinfo에서의 idx, 자식 노드를 저장하는 Node 클래스
        int x, y, num;
        Node left, right;
        
        public Node(int num, int x, int y) { //좌표와 nodeinfo의 idx저장
            this.num = num;
            this.x = x;
            this.y = y;
        }
    }
    
    private static Node makeBT(int[][] nodeinfo){ //이진트리 구축
        Node[] nodes = new Node[nodeinfo.length];
        for(int i = 0; i < nodeinfo.length; i++) { //0번 idx가 1번이므로 i+1로 저장
            nodes[i] = new Node(i + 1, nodeinfo[i][0], nodeinfo[i][1]);
        }
        
        Arrays.sort(nodes, (o1, o2) -> { //y값 기준 내림차순 정렬, 단 같은 레벨일 경우 x값 기준 오름차순 정렬
            if(o1.y == o2.y) {
                return Integer.compare(o1.x, o2.x);
            }
            return Integer.compare(o2.y, o1.y);
        });
        Node root = nodes[0];
        
        for(int i = 1; i < nodes.length; i++) { //노드의 x값이 parent보다 작고 parent.left가 없다면 left에 넣고 종료, left가 있다면 left를 parent로 다시 수행 (x값이 큰 경우도 마찬가지)
            Node parent = root;
            
            while(true) {
                if(nodes[i].x < parent.x) {
                    if(parent.left == null) {
                        parent.left = nodes[i];
                        break;
                    }
                    else {
                        parent = parent.left;
                    }
                }
                else {
                    if(parent.right == null) {
                        parent.right = nodes[i];
                        break;
                    }
                    else{
                        parent = parent.right;
                    }
                }
            }
        }
        return nodes[0];
    }
    
    private static void preOrder(Node curr, ArrayList<Integer> answer) { //전위순회 메서드(재귀) 부모 -> 왼쪽 자식 -> 오른쪽 자식 순서
        if(curr == null) {
            return;
        }
        answer.add(curr.num);
        preOrder(curr.left, answer);
        preOrder(curr.right, answer);
    }
        
    private static void postOrder(Node curr, ArrayList<Integer> answer) { //후위순회 메서드(재귀) 왼쪽 자식 -> 오른쪽 자식 -> 부모 순서
        if(curr == null) {
            return;
        }
        postOrder(curr.left, answer);
        postOrder(curr.right, answer);
        answer.add(curr.num);
    }
    
    public int[][] solution(int[][] nodeinfo) {
        Node root = makeBT(nodeinfo); //이진트리 구축 후 루트 노드 반환
        ArrayList<Integer> preOrderList = new ArrayList<>();
        preOrder(root, preOrderList); 
        ArrayList<Integer> postOrderList = new ArrayList<>();
        postOrder(root, postOrderList);
        
        int[][] answer = new int[2][nodeinfo.length];
        answer[0] = preOrderList.stream().mapToInt(Integer::intValue).toArray(); //각 Integer 리스트를 int형 배열로 변환해서 answer에 대입
        answer[1] = postOrderList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}
