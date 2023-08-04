import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        
        int[] answer = new int[score.length];
        //명예의 전당을 어레이리스트에 저장
        //가장 낮은 점수를 answer에 저장
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (set.size() < k) {
                set.add(score[i]);
            } else if (score[i] > set.get(0)) {
                set.remove(0);
                set.add(score[i]);
            }
            Collections.sort(set);
            answer[i] = set.get(0);
        }
        
        return answer;
    }
}