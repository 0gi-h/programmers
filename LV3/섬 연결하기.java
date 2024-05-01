import java.util.Arrays;

class Solution {
    private static int[] parent;
    
    private static int find(int x) {
        if(parent[x] == x) return x; //x의 루트 노드 찾기
        
        return parent[x] = find(parent[x]); //경로 압축, 루트 노드를 x의 부모 노드로 설정
    }
    
    private static void union(int x, int y) { //집합 합치기 연산
        int root1 = find(x);
        int root2 = find(y);
        parent[root2] = root1;
    }
    
    public int solution(int n, int[][] costs) { 
        Arrays.sort(costs, (o1, o2) -> Integer.compare(o1[2], o2[2])); //비용을 기준으로 오름차순 설정
        
        parent = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        int answer = 0; //최소 신장 트리 총비용
        int edges = 0; //연결된 다리 수
        
        for(int[] edge : costs) {
            if(edges == n - 1) break; //n-1개의 다리가 생긴 경우 모든 섬이 연결
            
            if(find(edge[0]) != find(edge[1])) { //다리가 연결하는 두 섬이 이미 연결되어 있는지 체크
                union(edge[0], edge[1]); //두 섬 연결
                
                answer += edge[2]; //비용 추가
                
                edges++; //다리 수 1증가
            }
        }
        return answer;
    }
}
