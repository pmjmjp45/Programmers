import java.util.*;
class Solution {
    public String solution(String s) {
        //String[]로 다시 저장하기
        String[] array = s.split(" ");
        
        
        //for문 돌려서 최대값, 최소값 구하기
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (String num : array) {
            max = Math.max(max, Integer.parseInt(num));
            min = Math.min(min, Integer.parseInt(num));
        }
        
        String answer = String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }
}