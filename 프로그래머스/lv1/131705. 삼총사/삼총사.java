import java.util.*;
class Solution {
    public static int answer = 0;
    public int solution(int[] number) {
        boolean[] visited = new boolean[number.length];
        int[] threes = new int[3];
        combination(number, threes, visited, 0, 0);
        return answer;
    }
    /*
        조합 DFS 방식
        int[] number: 문제에서 주어진 배열, 
        int[] threes: 삼총사 학번,
        boolean[] visited: 원본의 그 인덱스를 방문했는지 여부, 
        int start: 탐색 시작하는 원본의 인덱스, 
        int depth: 삼총사의 몇번째 멤버 탐색 중인지
    */
    public static void combination(int[] number, int[] threes, boolean[] visited, int start, int depth) {
        if (depth == 3) { // 3개 모두 뽑았을 경우
            System.out.println(Arrays.toString(threes));
            int total = 0;
            for (int x : threes) {
                total += x;
            }
            if (total == 0) {
                answer++;
            }
        } else {
            for (int i = start; i < number.length; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    threes[depth] = number[i];
                    combination(number, threes, visited, i + 1, depth + 1);
                    visited[i] = false;
                }
            }
        }
    }
}