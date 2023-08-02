import java.util.*;
class Solution {
    public int solution(int n) {
        int index = 1; //3x마을 기준 순서
        int num = 1; //3X 숫자
        
        while (index <= n) {
            ArrayList<String> numList = new ArrayList<>();
            String numStr = String.valueOf(num);
            for (int i = 0; i < numStr.length(); i++) {
                numList.add(numStr.substring(i, i + 1));
            }
            //System.out.println(numList);
            if (num % 3 == 0) { // 3의 배수일 경우
                num++;
            } else if (numList.contains("3")) {//3을 포함하는 경우
                num++;
            } else {
                num++;
                index++;
            }
            //System.out.println("num : " + num);
            //System.out.println("index : " + index);
        }
        
        int answer = num - 1;
        return answer;
    }
}