import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // queue에 progresses 정보 담기
        Queue<int[]> q = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int[] tmp = new int[3];
            tmp[0] = progresses[i];
            tmp[1] = speeds[i];
            tmp[2] = i;
            q.offer(tmp);
        }
        
        //queue로 하나씩 배열 빼면서 확인하기
        int[] now = new int[3]; // 작업 정도 확인{progresses, speeds, index}
        int index = 0; //몇번째 작업까지 완료했는지 확인
        int cnt = 0; //완료 개수 
        ArrayList<Integer> answer = new ArrayList<>();
        
        while (!q.isEmpty()) {
            now = q.poll();
            
            if (now[0] >= 100 && now[2] == index) { // 완료
                index++;
                cnt++;
            } else {
                if (cnt > 0) {
                    answer.add(cnt);
                    cnt = 0;
                }
                now[0] += now[1];
                q.offer(now);
            }
        }
        //마지막 배열 확인
        if (now[0] >= 100) {
            answer.add(cnt);
        }
        int[] answer1 = answer.stream().mapToInt(Integer::intValue).toArray();
        return answer1;
    }
}