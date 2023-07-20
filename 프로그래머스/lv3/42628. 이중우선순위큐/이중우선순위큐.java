import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        //오름차순, 내림차순 PriorityQue 만들기
        PriorityQueue<Integer> ascQ = new PriorityQueue<>();
        PriorityQueue<Integer> descQ = new PriorityQueue<>(Collections.reverseOrder());
        
        //operations 명령문에 맞춰 queue 조작
        for (String str : operations) {
            if (str.equals("D 1")) {
                if (!descQ.isEmpty()) {
                    ascQ.remove(descQ.poll());
                }
            } else if (str.equals("D -1")) {
                if (!ascQ.isEmpty()) {
                    descQ.remove(ascQ.poll());
                }
            } else {
                int num = Integer.parseInt(str.substring(2));
                ascQ.offer(num);
                descQ.offer(num);
            }
            // System.out.println("asc : " + ascQ.toString());
            // System.out.println("desc : " + descQ.toString());
        }
        
        //answer에 답 넣기
        int[] answer = {0, 0};
        
        if (!descQ.isEmpty()) {
            int max = descQ.poll();
            int min = ascQ.poll();
            
            answer[0] = max;
            answer[1] = min;
        } 
        return answer;
    }
}