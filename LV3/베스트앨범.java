import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Stream;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, ArrayList<int[]>> genreMap = new HashMap<>(); //장르와 <고유번호, 재생 횟수>를 저장하는 해시맵
        HashMap<String, Integer> playMap = new HashMap<>(); //장르와 재생수의 합을 저장하는 해시맵

        for(int i = 0; i < plays.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            if(!genreMap.containsKey(genre)){
                genreMap.put(genre, new ArrayList<>()); //초기화 해주지 않으면 NullPointerException발생
                playMap.put(genre, 0);
            }
            genreMap.get(genre).add(new int[]{i, play}); //장르별 노래의 고유번호와 재생수 저장
            playMap.put(genre, playMap.get(genre) + play); //장르별 재생 수의 합 저장
        }

        ArrayList<Integer> answer = new ArrayList<>();

        Stream<Map.Entry<String, Integer>> sortedGenre = playMap.entrySet() //playMap을 내림차순으로 정렬(장르 정렬)
            .stream()
            .sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));


      //genreMap을 내림차순으로 정렬, (장르별 노래 재생 수 정렬)
      //낮은 고유번호 순이 되는 이유는 sorted는 순서가 있는 스트림 정렬 시 기존 순서 유지(낮은 번호 순으로 ArrayList에 삽입했기 때문)
      //limit(2) - 최대 2개까지 데이터 반환
        sortedGenre.forEach(entry -> { 
            Stream<int[]> sortedSongs = genreMap.get(entry.getKey()).stream()
                .sorted((o1, o2) -> Integer.compare(o2[1], o1[1])) 
                .limit(2);
            sortedSongs.forEach(song -> answer.add(song[0]));
        });


        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
