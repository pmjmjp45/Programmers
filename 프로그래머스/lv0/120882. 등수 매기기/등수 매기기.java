import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        //평균 배열에 저장하기
        int[] avg = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            avg[i] = (score[i][0] + score[i][1]) ;
        }
        //System.out.println(Arrays.toString(avg));
        //등수 구하기
        int[] answer = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            int rank = 1;
            for (int j = 0; j < score.length; j++) {
                if (avg[j] > avg[i]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}