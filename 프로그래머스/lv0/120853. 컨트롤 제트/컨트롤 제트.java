class Solution {
    public int solution(String s) {
        String[] input = s.split(" ");
        
        int answer = 0;
        int tmp = 0;
        for (String str : input) {
            if (str.equals("Z")) {
                answer -= tmp;
            } else {
                tmp = Integer.parseInt(str);
                answer += tmp;
            }
        }
        
        return answer;
    }
}