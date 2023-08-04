import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] arr = s.split("");
        HashMap<String, Integer> map = new HashMap<>();
        
        // 한 글자씩 돌아가며 맵에 (알파벳, 인덱스) 저장
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                answer[i] = -1;
                map.put(arr[i], i);
            } else {
                answer[i] = i - map.get(arr[i]);
                map.put(arr[i], i);
            }
        }
        return answer;
    }
}