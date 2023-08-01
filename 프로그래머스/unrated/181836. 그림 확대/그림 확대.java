import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        for (int i = 0; i < picture.length; i++) {
            String newText = "";
            for (int j = 0; j < picture[i].length(); j++) {//한 글자 k배로
                String tmp = picture[i].substring(j, j + 1);
                for (int l = 0; l < k; l++) {
                    newText += tmp;
                }
            }
            for (int l = 0; l < k; l++) {//한 줄 k배로
                answer[i * k + l] = newText;
            }
        }
        return answer;
        
    }
}