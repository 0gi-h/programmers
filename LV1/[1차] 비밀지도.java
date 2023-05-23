class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = answer[i].replace('1', '#');
            answer[i] = answer[i].replace('0', ' ');
            while (answer[i].length() < n) {
                answer[i] = ' ' + answer[i];
            }
        }
        return answer;
    }
}
