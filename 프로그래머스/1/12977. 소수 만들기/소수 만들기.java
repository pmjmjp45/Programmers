import java.util.*;
class Solution {
    public static int answer;
    public int solution(int[] nums) {
        answer = 0;
        //조합
        boolean[] visited = new boolean[nums.length];
        getCombination(nums, visited, 0, 0);
        System.out.println("Main answer : " + answer);
        //소수인지 판별

        return answer;
    }
    // depth: 몇 번째 수 고르는 중인지
    // start: 배열 중 몇 번째 숫자를 보는 중인지
    public void getCombination(int[] nums, boolean[] visited, int depth, int start) {
        if (depth == 3) { // 다 골랐으면 소수인지 확인하는 메서드로 넘긴다
            isSosu(nums, visited);

        } else if (start == nums.length) { // 배열의 모든 숫자 확인했으면 메서드 종료
            return;
            
        } else {
            //이 숫자를 조합에 포함한 경우(depth + 1)
            visited[start] = true;
            getCombination(nums, visited, depth + 1, start + 1);
            
            //이 숫자를 조합에 포함하지 않은 경우(depth 그대로)
            visited[start] = false;
            getCombination(nums, visited, depth, start + 1);
        }
    
    }
    public void isSosu(int[] nums, boolean[] visited) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == true) {
                sum += nums[i];
            }
        }
        int yaksu = 0;
        for (int i = 2; i <= Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                yaksu++;
            }
        }

        if (yaksu == 0) {
            answer++;
        }
    }
}