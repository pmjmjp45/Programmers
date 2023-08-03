class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            //quiz 내용 배열에 저장
            String[] line = quiz[i].split(" ");
            
            //연산
            
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[2]);
            int z = Integer.parseInt(line[4]);
            // int x = getNum(line[0]);
            // int y = getNum(line[2]);
            // int z = getNum(line[4]);
            String math = line[1];
            int ans = 0;

            if (math.equals("+")) {
                ans = x + y;
            } else {
                ans = x - y;
            }
            
            if (ans == z) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
            
        }
        return answer;
    }
    
    public static int getNum(String str) {
        int ret = 0;
        if (str.startsWith("-")) {
            ret = -1 * Integer.parseInt(str.substring(1));
        }
        return ret;
    }
}