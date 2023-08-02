import java.util.*;
class Solution {
    public int solution(String A, String B) {
        String[] arr = A.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        int answer = 0;
        
        for (int i = 0; i < arr.length ; i++) {
            String tmp = list.toString().replaceAll(",", "").replaceAll(" ", "").replace("[", "").replace("]", "");
            if (tmp.equals(B)) {
                return answer;
            } else {
                String letter = list.get(list.size() - 1);
                list.remove(list.size() - 1);
                list.add(0, letter);
                answer++;
            }
        }
        
        return -1;
    }
}