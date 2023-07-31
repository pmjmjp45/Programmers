import java.util.*;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        int cnt = 0;
        //sides의 큰 쪽이 가장 긴 변일 경우
        for (int i = 0; i <= sides[1]; i++) {
            if (sides[0] + i <= sides[1]) continue;
            cnt++;
        }
        
        //나머지 하나가 가장 긴 변일 경우
        for (int i = sides[1] + 1; i < sides[0] + sides[1]; i++) {
            cnt++;
        }
        
        return cnt;
    }
}