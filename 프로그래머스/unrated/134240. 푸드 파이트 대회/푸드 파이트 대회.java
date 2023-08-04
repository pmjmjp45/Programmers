class Solution {
    public String solution(int[] food) {
        StringBuilder b = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            if (count != 0) { // 음식 2개 이상 있다면 
                for (int j = 0; j < count; j++) {
                    b.append(String.valueOf(i));
                }
            }
        }
        //물 더하고 거울 형으로 완성
        String answer = "";
        answer = b.toString() + "0";
        String opposite = b.reverse().toString();
        
        answer += opposite;
        
        return answer;
    }
}