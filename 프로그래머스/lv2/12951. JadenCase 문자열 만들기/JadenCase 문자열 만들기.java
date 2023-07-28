import java.util.*;
class Solution {
    public String solution(String s) {
        //문자별로 분리해 배열에 저장
        char[] array = s.toCharArray();
        
        //첫글자 바꾸기
        if (array.length == 1) {
            if (!Character.isDigit(array[0])) {//첫번째 단어
                array[0] = Character.toUpperCase(array[0]);
            }
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (!Character.isDigit(array[0])) {//첫번째 단어
                    array[0] = Character.toUpperCase(array[0]);
                } 
                if (array[i] == ' ' && array[i + 1] !=' ' && !Character.isDigit(array[i + 1])) {//빈 칸 다음
                    array[i + 1] = Character.toUpperCase(array[i + 1]);
                } else {
                    array[i + 1] = Character.toLowerCase(array[i + 1]);
                }
            }
        }
        
        
        //다시 문자열로 변환
        String answer = "";
        for (char c : array) {
            answer += String.valueOf(c);
        }
        
        return answer;
    }
}