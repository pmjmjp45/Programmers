import java.util.*;
class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        //리스트에 넣고 for문 돌리면서 비교하기
        ArrayList<Integer> numList = new ArrayList<>();
        
        for (int num : numLog) {
            numList.add(num);
        }

        for (int i = 0; i < numList.size() - 1; i++) {
            int gap = numList.get(i + 1) - numList.get(i);
            
            switch(gap) {
                case 1 : answer += "w";
                    break;
                    
                case -1 : answer += "s";
                    break;
                    
                case 10 : answer += "d";
                    break;
                    
                case -10 : answer += "a";
                    break;
            }
        }
        return answer;
    }
}