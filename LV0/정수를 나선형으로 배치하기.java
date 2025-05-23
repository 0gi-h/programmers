class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] x = {1, 0, -1, 0};
        int[] y = {0, 1, 0, -1};
        int r = 0;
        int c = 0;
        int dir = 0;
        int num = 1;
        for(int i = 0; i < n*n; i++) {
            answer[r][c] = num++;

            //다음 위치
            int nr = r + y[dir % 4];
            int nc = c + x[dir % 4];

            //다음 위치가 틀린 위치라면 이동 방향 변경
            if (nr < 0 || n <= nr || nc < 0 || n <= nc || answer[nr][nc] != 0){
                dir += 1;
            }

            //변경된 값 저장
            r = r + y[dir % 4];
            c = c + x[dir % 4];
        }
        
        return answer;
    }
}
