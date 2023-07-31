import java.util.*;
class Solution {
    public int solution(int M, int N) {
        //M과 N을 크기로 분류
        int max = Math.max(M, N);
        int min = Math.min(M, N);
        
        //작은 쪽 1이 될 때까지 먼저 자른다
        int answer = min - 1;
        
        //큰 쪽 1이 될 때까지 자른다(반복)
        answer += (max - 1) * min;
        
        return answer;
    }
}