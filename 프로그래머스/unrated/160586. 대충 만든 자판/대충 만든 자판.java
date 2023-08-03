import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int j = 0; j < targets.length; j++) { // target 모든 단어
            String[] tLetters = targets[j].split("");
            int minWord = 0;
            
            for (int i = 0; i < tLetters.length; i++) { // 단어의 한 글자
                int minOne = Integer.MAX_VALUE; // 한 글자 누르는 최소값
                for (String key : keymap) {
                    if (key.indexOf(tLetters[i]) != -1) {
                        minOne = Math.min(minOne, key.indexOf(tLetters[i]) + 1);
                    }
                }
                if (minOne == Integer.MAX_VALUE) { // 키패드 없을 때
                    minWord = -1;
                    break;
                } else {
                    minWord += minOne;
                }
            }
            answer[j] = minWord;
        }
        
        return answer;
    }
}