class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        //lottos 기준으로 맞춘 개수 구하기 & 0의 개수 구하기
        int hit = 0; // 맞춘 개수
        int zero = 0; //0의 개수
        
        for (int l : lottos) {
            if (l == 0) {
                zero++;
            } 
            for (int w : win_nums) {
                if (l == w) {
                    hit++;
                }
            }
        }
        //맞춘 개수 = 최저 순위
        //맞춘 개수 + 0의 개수 = 최고 순위
        int[] answer = new int[2];
        
        if (7 - (hit + zero) > 5) {
            answer[0] = 6;
        } else {
            answer[0] = 7 - (hit + zero);
        }
        
        if (7 - hit > 5) {
            answer[1] = 6;
        } else {
            answer[1] = 7 - hit;
        }
        
        return answer;
    }
}