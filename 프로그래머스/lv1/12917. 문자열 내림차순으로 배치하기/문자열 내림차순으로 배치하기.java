import java.util.*;
class Solution {
    public String solution(String s) {
        String[] array = s.split("");
        Arrays.sort(array, Collections.reverseOrder());
        
        String answer = "";
        for (String str : array) {
            answer += str;
        }
        return answer;
    }
}