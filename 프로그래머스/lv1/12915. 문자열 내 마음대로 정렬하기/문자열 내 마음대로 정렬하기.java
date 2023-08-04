import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        //우선 사전순으로 정렬
        Arrays.sort(strings);
        
        //n번째 글자 기준으로 정렬
        Arrays.sort(strings, (a, b) -> a.charAt(n) - b.charAt(n));
        
        String[] answer = strings;
        return answer;
    }
}