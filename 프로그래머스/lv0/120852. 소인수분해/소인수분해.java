import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        //약수인지 확인
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) { //그 약수가 소수인지 확인
                int cnt = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        cnt++;
                    }
                }
                if (cnt == 0) {
                   list.add(i); 
                }
            }
        }
        
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}