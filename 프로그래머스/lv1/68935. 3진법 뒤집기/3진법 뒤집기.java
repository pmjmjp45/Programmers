import java.util.*;
class Solution {
    public int solution(int n) {
        String number = "";
        //3진법
        int t = 0;
        while (n > Math.pow(3, t)) {
            t++;
        }
        for (int i = t; i >= 0; i--) {
            number += String.valueOf((n % (int)Math.pow(3, i + 1)) / (int)Math.pow(3, i));
        }
        number = String.valueOf(Long.parseLong(number)); //맨 앞 0 날려줌
        
        //앞뒤 반전
        String number2 = "";
        for (int i = number.length(); i > 0 ; i--) {
            number2 += number.substring(i - 1, i);
        }
        
        //10진법
        String[] number3 = number2.split("");
        int answer = 0;
        for (int i = 0; i < number3.length; i++) {
            answer += Math.pow(3, i) * Integer.parseInt(number3[number3.length - 1 - i]);
        }
        
        return answer;
    }
}