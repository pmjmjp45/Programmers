import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        //기준 숫자와의 차이(절대값)를 해쉬맵에 저장
        HashMap<Integer, Integer> gap = new HashMap<>(); 
        
        for (int x : numlist) {
            gap.put(x, Math.abs(x - n));
        } 
        
        //value 기준으로 해쉬맵 정렬하기
        List<Integer> keys = new ArrayList<>(gap.keySet());
        // 일단 내림차순으로 정렬 - 같은 value면 큰 쪽의 key가 먼저 나오게
        Collections.sort(keys, Collections.reverseOrder()); 

        Collections.sort(keys, (v1, v2) -> (gap.get(v1).compareTo(gap.get(v2))));
        
        //정렬한 배열 리턴하기
        int[] answer = new int[numlist.length];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = keys.get(i);
		}
        
        return answer;
    }
}