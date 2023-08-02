import java.util.*;
class Solution {
    public String solution(String s) {
        int index = 0;
        String[] array = s.split("");
        
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(" ")) { // 공백일 경우
                index = 0;
            } else if (index % 2 == 0) { //짝수번째
                array[i] = array[i].toUpperCase();
                index++;
            } else if (index % 2 != 0) { // 홀수번째
                array[i] = array[i].toLowerCase();
                index++;
            }
        }
        
        String answer = "";
        for (String str : array) {
            answer += str;
        }
        
        return answer;
    }
}