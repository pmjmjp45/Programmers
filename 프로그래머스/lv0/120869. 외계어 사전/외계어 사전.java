import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        //spell 어레이리스트에 담기
        ArrayList<String> list = new ArrayList<>();
        for (String str : spell) {
            list.add(str);
        }
        
        //dic 한 단어씩 spell과 비교하기
        int answer = 2;
        for (String word : dic) {
            ArrayList listTmp = (ArrayList<String>)list.clone();
            for (int i = 0; i < word.length(); i++) {
                String letter = word.substring(i, i + 1);
                if (listTmp.size() > 0 && listTmp.contains(letter)) {
                    listTmp.remove(letter);
                    
                    if (listTmp.size() == 0) {
                        answer = 1;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}