class Solution {
     int[] dx = {1, 0, -1, 0};
     int[] dy = {0, 1, 0, -1};
    
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        for(int i = 0; i < 4; i++) {
            int rh = h + dx[i];
            int rw = w + dy[i];
            
            if(rh < 0 || rw < 0 || rh >= board.length || rw >= board[0].length) {
                continue;
            }
            else {
                if(board[rh][rw].equals(board[h][w])) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
