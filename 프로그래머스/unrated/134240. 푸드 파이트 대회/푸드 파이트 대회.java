class Solution {
    public String solution(int[] food) {
        String answer = "";
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            if (count != 0) { // 음식 2개 이상 있다면 
                for (int j = 0; j < count; j++) {
                    answer += String.valueOf(i);
                }
            }
        }
        //물 더하고 거울 형으로 완성
        String[] ansArr = answer.split("");
        String opposite = "";
        for (int i = ansArr.length - 1; i >= 0; i--) {
            opposite += ansArr[i];
        }
        answer += "0" + opposite;
        
        return answer;
    }
}