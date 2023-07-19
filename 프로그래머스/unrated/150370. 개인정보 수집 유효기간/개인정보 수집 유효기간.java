import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        //terms 정보 hashmap에 넣기
        HashMap<String, Integer> termsMap = new HashMap<>();
        
        for (String str : terms) {
            termsMap.put(str.substring(0, 1), Integer.parseInt(str.substring(2))); 
        }
        
        //비교하기
        ArrayList<Integer> answer0 = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            String start = privacies[i].substring(0, 10);
            String rank = privacies[i].substring(11);
            
            //유효기간
            int limit = termsMap.get(rank) * 28;
            
            //today - start
            int daysGoneBy = calDays(today, start);
            
            if (daysGoneBy >= limit) {
                answer0.add(i + 1);
            }
        }
        
        int[] answer = answer0.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
    
    //날짜 계산 메서드
    public static int calDays(String today, String start) {
        int tYear = Integer.parseInt(today.substring(0, 4));
        int tMonth = Integer.parseInt(today.substring(5, 7));
        int tDay = Integer.parseInt(today.substring(8, 10));
        int sYear = Integer.parseInt(start.substring(0, 4));
        int sMonth = Integer.parseInt(start.substring(5, 7));
        int sDay = Integer.parseInt(start.substring(8, 10));
        
        //2000.01.01부터 today의 날짜는?
        int tTotal = 0;
        tTotal = (tYear - 2000) * 12 * 28;
        tTotal += tMonth * 28;
        tTotal += tDay;
        
        //2000.01.01부터 start의 날짜는?
        int sTotal = 0;
        sTotal = (sYear - 2000) * 12 * 28;
        sTotal += sMonth * 28;
        sTotal += sDay;
        
        return tTotal - sTotal;
    }
    
}