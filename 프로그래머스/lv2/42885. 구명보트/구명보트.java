import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        //정렬한 뒤 가장 가벼운 사람과 가장 무거운 사람의 합과 limit 비교
        // 합 <= limit : 한꺼번에 옮김
        // 합 > limit : 무거운 사람만 옮김
        Arrays.sort(people);
        
        int right = people.length - 1; //가장 무거운 사람의 인덱스
        int left = 0; // 가장 가벼운 사람의 인덱스
        int answer = 0;
        
        while(left <= right) {
            if (people[left] + people[right] <= limit) {
                answer++;
                left++;
                right--;
            } else {
                answer++;
                right--;
            }
        }
        return answer;
    }
}