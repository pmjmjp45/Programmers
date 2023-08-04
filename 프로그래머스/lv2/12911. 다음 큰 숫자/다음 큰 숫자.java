import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int newNumber = n;
        
        //n의 이진수 1의 개수
        String nStr = Integer.toBinaryString(n);
        char[] nStr2 = nStr.toCharArray();
        int nOne = 0;
        for (char s : nStr2) {
            if (s == '1') {
                nOne++;
            }
        }
        // String nStr = Integer.toBinaryString(n).replaceAll("0","");
        // int nOne = nStr.length();
        
        boolean check = false;
        while(!check) {
            //다음 수로 넘어감
            newNumber++;
            
            //조건 2
            // String newStr = Integer.toBinaryString(newNumber).replaceAll("0","");;
            // int newOne = newStr.length();
            String newStr = Integer.toBinaryString(newNumber);
            char[] newStr2 = newStr.toCharArray();
            int newOne = 0;
            for (char s : newStr2) {
                if (s == '1') {
                    newOne++;
                }
            }
            if (nOne == newOne) {
                check = true;
            }
        }
        
        return newNumber;
    }
}