import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        //scoville 모두 큐에 넣기
        for (int x : scoville) {
            queue.offer(x);
        }
        
        int answer = 0;
        while(queue.peek() < K) {
            if (queue.size() < 2) {
                answer = -1;
                break;
            }
            
            int n = queue.poll() + (queue.poll() * 2); 
            queue.offer(n);
            answer++;
        }
        
        return answer;
    }
}