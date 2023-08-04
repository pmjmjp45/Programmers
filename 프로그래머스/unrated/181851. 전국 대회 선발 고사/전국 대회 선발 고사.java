import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // 출석 가능한 학생만 해시맵에 저장(등수, 인덱스)
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == true) {
                map.put(rank[i], i);
            }
        }
        
        //맵 키값 기준으로 정렬하고 순위에 든 사람(인덱스) 뽑기
        TreeSet<Integer> keys = new TreeSet<>(map.keySet());
        int first = map.get(keys.first());
        keys.pollFirst();
        int second = map.get(keys.first());
        keys.pollFirst();
        int third = map.get(keys.first());
       
        // 답 도출
        int answer = 10000 * first + 100 * second + third;
        return answer;
    }
}