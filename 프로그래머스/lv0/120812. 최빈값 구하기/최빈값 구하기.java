import java.util.*;
class Solution {
    public int solution(int[] array) {
        //해쉬맵에 값 넣기
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        //최고빈도 구하기
        int max = 0;
        for (int key : map.keySet()) {
            max = Math.max(map.get(key), max);
        }
        
        //최빈값 구하기(최빈값 개수 구하기)
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                answerList.add(key);
            }
        }
        
        if (answerList.size() == 1) {
            return answerList.get(0); 
        } else {
            return -1;
        }
    }
}