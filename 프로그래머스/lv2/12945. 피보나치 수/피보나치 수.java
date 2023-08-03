import java.util.*;
class Solution {
    public int solution(int n) {
        //long fiboed = fibo(n);
        
        ArrayList<Long> fibo2 = new ArrayList<>();
        fibo2.add(0L);
        fibo2.add(1L);
        for (int i = 2; i <= n; i++) {
            Long tmp = ((fibo2.get(i - 1) % 1234567) + (fibo2.get(i - 2) % 1234567)) % 1234567;
            fibo2.add(tmp);
        }
        long answer0 = fibo2.get(n);
        int answer = (int)answer0;
        return answer;
    }
    
    // public static long fibo(int x) {
    //     if (x <= 1) {
    //         return x;
    //     } else {
    //         return fibo(x - 1) + fibo(x - 2);
    //     }
    // }
}