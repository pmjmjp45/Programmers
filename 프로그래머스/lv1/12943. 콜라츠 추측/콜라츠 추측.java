class Solution {
    public int solution(int num) {
        int answer = -1;
        int cnt = 0; //반복 횟수
        long numLong = Long.valueOf(num); // int형일 경우 큰 수에서 overflow 발생
        while (cnt <= 500) {
            if (numLong == 1) {
                return cnt;
            } else if (numLong % 2 == 0) {
                numLong = numLong / 2;
            } else {
                numLong = numLong * 3 + 1;
            }
            cnt++;
        }
        
        return answer;
    }
}