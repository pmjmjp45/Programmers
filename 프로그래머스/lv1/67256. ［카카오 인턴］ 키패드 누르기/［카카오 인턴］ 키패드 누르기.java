class Solution {
    public static final int[][] keypad = {{1, 0}, 
                                          {0, 3}, {1, 3}, {2, 3}, 
                                          {0, 2}, {1, 2}, {2, 2},
                                          {0, 1}, {1, 1}, {2, 1}};
    public String solution(int[] numbers, String hand) {
        //keypad 도면 만들기
        // 0~9순서, (x,y)
        // int[][] keypad = {{1, 0}, 
        //                   {0, 3}, {1, 3}, {2, 3}, 
        //                   {0, 2}, {1, 2}, {2, 2},
        //                   {0, 1}, {1, 1}, {2, 1}};
        
        //현재 위치
        int[] rightNow = {0, 0};
        int[] leftNow = {2, 0};
        
        //번호 누르기
        String answer = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (keypad[numbers[i]][0] == 0) {
                // answer += "L";
                builder.append("L");
                leftNow = keypad[numbers[i]];
            } else if (keypad[numbers[i]][0] == 2) {
                // answer += "R";
                builder.append("R");
                rightNow = keypad[numbers[i]];
            } else {
                //오른쪽이 가까운 경우
                if (getDistance(leftNow, numbers[i]) > getDistance(rightNow, numbers[i])) {
                    // answer += "R";
                    builder.append("R");
                    rightNow = keypad[numbers[i]];
                //왼쪽이 가까운 경우
                } else if (getDistance(leftNow, numbers[i]) < getDistance(rightNow, numbers[i])) {
                    // answer += "L";
                    builder.append("L");
                    leftNow = keypad[numbers[i]];
                //거리 같은 경우
                } else {
                    if (hand.equals("right")) {
                        // answer += "R";
                        builder.append("R");
                        rightNow = keypad[numbers[i]];
                    } else {
                        // answer += "L";
                        builder.append("L");
                        leftNow = keypad[numbers[i]];
                    }
                }
            }
        }
       
        return builder.toString();
    }
    
    public static int getDistance(int[] hand, int goal) {
        int[] goalPoint = keypad[goal];
        
        int distance = Math.abs(goalPoint[0] - hand[0]) + Math.abs(goalPoint[1] - hand[1]);
        
        return distance;
    }
}