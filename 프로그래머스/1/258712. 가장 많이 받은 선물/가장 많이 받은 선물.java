import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int lenF = friends.length;
        int lenG = gifts.length;
        
        // 이중배열로 정리
        int[][] presents = new int[lenF][lenF];
        for (String present : gifts) {
            for (int i = 0; i < lenF; i++) {// 준 사람
                for (int j = 0; j < lenF; j++) {// 받은 사람
                    if (present.split(" ")[0].equals(friends[i]) && present.split(" ")[1].equals(friends[j])) {
                    // if (present.startsWith(friends[i]) && present.endsWith(friends[j])) {
                        presents[i][j]++;
                    }
                }
            }
        }
        
        // 각 인물이 준 선물 개수와 받은 선물 개수 -> 선물 지수
        int[] point = new int[lenF];
        
        for (int i = 0; i < lenF; i++) {
            int givePoint = 0;
            int receivePoint = 0;
            
            for (int giveCount : presents[i]) {
                givePoint += giveCount;
            }
            
            for (int[] receiveCount : presents) {
                receivePoint += receiveCount[i];
            }
            
            point[i] = givePoint - receivePoint;
        }
        
        // 인물 간 기록을 비교하고, 동률일 경우 선물지수 비교
        //  -> 다음 달에 받을 선물 계산
        int[] next = new int[lenF];
        for (int i = 0; i < lenF; i++) {
            for (int j = 0; j < lenF; j++) { // 본인 - 본인
                if (i == j) {
                    continue;
                } else if (presents[i][j] > presents[j][i]) { // 본인 > 타인
                    next[i]++;
                } else if (presents[i][j] == presents[j][i]) { // 선물지수 비교
                    if (point[i] > point[j]) {
                        next[i]++;
                    }
                }
            }
        }
        
        // 결과
        Arrays.sort(next);
        return next[lenF - 1];
    }
}