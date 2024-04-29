import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    private static class Info {
        int node, sheep, wolf; //현재노드, 양위 수, 늑대의 수
        HashSet<Integer> visited; //방문한 노드의 집합
        
        public Info(int node, int sheep, int wolf, HashSet<Integer> visited) {
            this.node = node;
            this.sheep = sheep;
            this.wolf = wolf;
            this.visited = visited;
        }
    }
    
    private static ArrayList<Integer>[] tree; //트리 정보를 저장할 인접 리스트
    
    private static void buildTree(int[] info, int[][]edges) { //트리 구축 메서드
        tree = new ArrayList[info.length];
        for(int i = 0; i < tree.length; i++) {
            tree[i] = new ArrayList<>(); // idx별 자식 노드에 대한 정보를 담기 위해 각 idx에 대해 리스트 초기화
        }
        
        for(int[] edge : edges) {
            tree[edge[0]].add(edge[1]); //각 노드에 자식 노드 추가, 두 개라면 이어서 추가
        }
    }
    
    public int solution(int[] info, int[][] edges) {
        buildTree(info, edges);
        int answer = 0;
        
        ArrayDeque<Info> queue = new ArrayDeque<>(); //BFS를 위한 덱(큐로 활용) 생성 
        queue.add(new Info(0, 1, 0, new HashSet<>())); //초기 상태 설정, BFS는 원소가 없을때까지 진행하므로 탐색 수행전에 넣어줘야함
        
        while(!queue.isEmpty()) {
            Info now = queue.poll();
            answer = Math.max(answer, now.sheep);
            now.visited.addAll(tree[now.node]); //방문할 노드(now.node의 자식노드)를 visited에 추가
            
            for(int next : now.visited) {
                HashSet<Integer> set = new HashSet<>(now.visited); //visited를 복사한 해시 셋 생성
                set.remove(next); //다음 노드 삭제, 방문한 노드를 미리 삭제해 다시 가지 않기 위함
                
                if(info[next] == 1) {
                    if(now.sheep != now.wolf + 1) { //늑대의 수가 양의 수보다 작다면 해당 노드 방문
                        queue.add(new Info(next, now.sheep, now.wolf + 1, set));
                    }
                }
                else { //양이라면 무조건 방문
                    queue.add(new Info(next, now.sheep + 1, now.wolf, set));
                }
            }
        }
        
        return answer;
    }
}
