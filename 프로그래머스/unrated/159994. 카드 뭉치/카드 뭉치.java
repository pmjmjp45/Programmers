import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        //cards1, cards2를 어레이리스트에 저장
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        for (String str : cards1) {
            list1.add(str);
        }
        for (String str : cards2) {
            list2.add(str);
        }
        
        //goal과 비교
        int index1 = 0;
        int index2 = 0;
        String answer = "Yes";
        
        for (int i = 0; i < goal.length; i++) {
            if (index1 < cards1.length && goal[i].equals(cards1[index1])) {
                index1++;
            } else if (index2 < cards2.length && goal[i].equals(cards2[index2])) {
                index2++;
            } else {
                answer = "No";
                break;
            }
            
        }
        
        return answer;
    }
}