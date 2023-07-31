import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        //my_str을 String[]로 저장
        String[] array = my_str.split("");
        
        //n개씩 문자열 만들어서 저장
        for (int i = 0; i < array.length; i += n) {
            String word = ""; //저장할 문자열 초기화
            for (int j = 0; j < n; j++) {
                word += array[i + j];
                if (i + j == array.length - 1) break;
            }
            list.add(word);
        }
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}