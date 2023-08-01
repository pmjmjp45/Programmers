import java.util.*;
class Solution {
    public int solution(int[] array) {
        //최대 빈도 찾기
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : array) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        int max = 0; // 최대 빈도
        for (int x : map.keySet()) {
            if (map.get(x) > max) {
                max = map.get(x);
            }
        }
        //최대 빈도의 값 개수
        ArrayList<Integer> answer0 = new ArrayList<>();
        
        for (int x : map.keySet()) {
            if (map.get(x) == max) {
                answer0.add(x);
            }
        }
        if (answer0.size() > 1) {
            return -1;
        } else {
           return answer0.get(0); 
        }
    }
}