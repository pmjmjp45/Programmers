import java.util.*;
class Solution {
    //조합되는 숫자 해쉬셋에 저장
    public static HashSet<Integer> set = new HashSet<>();
    public int[] solution(int l, int r) {
        //조합 찾기
        String rStr = String.valueOf(r);
        int[] digits = {0, 5};
    
        for (int i = 1; i <= rStr.length(); i++) {
            int[] number = new int[i];
            boolean[][] visited = new boolean[i][2];
            permutation(digits, number, visited, 0, i);
        }
        
        //조합이 범위 안에 드는지 확인
        ArrayList<Integer> list = new ArrayList<>();
       for (int x : set) {
           if (x >= l && x <= r) {
               list.add(x);
           }
       }
        //오름차순 정렬하고 형변환해서 정답 제출
        if (list.size() == 0) {
            list.add(-1);
        }
        Collections.sort(list);
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
    //순열 찾는 방식 응용해서 숫자 조합 찾기
    public static void permutation(int[] digits, int[] number, boolean[][] visited, int depth, int r) {
        if (depth == r) {
            int result = 0;
            for (int i = 0; i < number.length; i++) {
                result += number[i] * Math.pow(10, number.length - 1 - i);
            }
            set.add(result);
        } else {
            for (int i = 0; i < digits.length; i++) {
                if (!visited[depth][i]) {
                    visited[depth][i] = true;
                    number[depth] = digits[i];
                    
                    permutation(digits, number, visited, depth + 1, r);
                    
                    visited[depth][i] = false;
                }
            }
        }
    }
}