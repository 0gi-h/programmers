class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        for(int i = 0; i < park.length; i++) {
            if(park[i].contains("S")) {
                x = park[i].indexOf("S");
                y = i;
            }
        }
        for(int i = 0; i < routes.length; i++) {
            int n = Character.getNumericValue(routes[i].charAt(2));
            switch(routes[i].charAt(0)) {
                case 'E': 
                    if(x+n < park[0].length()){
                        for(int j = 1; j <= n; j++) {
                            if(park[y].charAt(x+j) == 'X')
                                break;
                            else if(j == n) {
                                x = x+n;
                            }
                        }
                    }
                    break;
                case 'W': 
                    if(x-n >= 0){
                        for(int j = 1; j <= n; j++) {
                            if(park[y].charAt(x-j) == 'X')
                                break;
                            else if(j == n) {
                                x = x-n;
                            }
                        } 
                    }
                    break;
                case 'N': 
                    if(y-n >= 0){
                        for(int j = 1; j <= n; j++) {
                            if(park[y-j].charAt(x) == 'X')
                                break;
                            else if(j == n) {
                                y = y-n;
                            }
                        }
                    }
                    break;
                case 'S': 
                    if(y+n < park.length){
                        for(int j = 1; j <= n; j++) {
                            if(park[y+j].charAt(x) == 'X')
                                break;
                            else if(j == n) {
                                y = y+n;
                            }
                        }
                    }
                    break;
            }    
        }
        answer[0] = y;
        answer[1] = x;
        return answer;
    }
}
