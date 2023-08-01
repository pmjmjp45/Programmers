import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String start = privacies[i].substring(0, 10);
            String level = privacies[i].substring(11);
            
            //규약 깨지는 날
            int endMonth = 0; // 유효기간
            for (String t : terms) {
                if (t.startsWith(level)) {
                    endMonth = Integer.parseInt(t.substring(2));
                    break;
                }
            }
            int endDay = (endMonth * 28) + calDays(start);
            
            //오늘 
            int todayCal = calDays(today);
            
            if (endDay <= todayCal) {
                list.add(i + 1);
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
    // 2000.01.01부터 몇일이 지났나 계산
    public int calDays(String day) {
        int year = Integer.parseInt(day.substring(0, 4));
        int month = Integer.parseInt(day.substring(5, 7));
        int date = Integer.parseInt(day.substring(8, 10));
        
        int days = (year - 2000) * 12 * 28 + (month - 1) * 28 + date - 1;
        return days;
    }
}