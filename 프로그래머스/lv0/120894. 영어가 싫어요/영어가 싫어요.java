import java.util.*;
class Solution {
    public long solution(String numbers) {
        //해쉬맵에 영문-숫자 저장
        HashMap<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        //배열에 numbers 저장
        String[] numStr = numbers.split("");
        
        //바꾸기
        String tmp = "";
        String answerStr = "";
        for (int i = 0; i < numStr.length; i++) {
            tmp += numStr[i];
            
            for (String s : map.keySet()) {
                if (s.equals(tmp)) {
                    answerStr += map.get(s);
                    tmp = "";
                }
            }
        }
        
        long answer = Long.valueOf(answerStr);
        return answer;
    }
}