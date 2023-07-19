import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        //cards1 과 cards2 arrayList에 저장하기
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        for (String s : cards1) {
            list1.add(s);
        }
        for (String s : cards2) {
            list2.add(s);
        }
        // goal 기준으로 비교해서 불가능하면 No, arrayList가 비면 Yes
        String answer = "";
        for (String s : goal) {
            if (!list1.isEmpty() && list1.get(0).equals(s)) {
                list1.remove(0);
            } else if (!list2.isEmpty() && list2.get(0).equals(s)) {
                list2.remove(0);
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}