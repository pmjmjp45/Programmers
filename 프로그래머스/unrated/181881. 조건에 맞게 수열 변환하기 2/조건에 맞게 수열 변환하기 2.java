import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        while (true) {
            int[] arr0 = arr.clone();
            int[] arr2 = calc(arr);
            // System.out.println(Arrays.toString(arr0));
            // System.out.println(Arrays.toString(arr2));
            
            if (sameOrDiff(arr0, arr2) == true) {
                break;
            } else {
                arr0 = arr2.clone();
                answer++;
            }
            
        }
        return answer;
    }
    //작업하는 메서드
    public static int[] calc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] = arr[i] * 2 + 1;
            }
        }
        return arr;
    }
    //전 배열과 같은지 판별하는 메서드
    public static boolean sameOrDiff(int[] arr, int[] arr2) {
        boolean same = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                same = false;
                break;
            }
        }
        return same;
    }
}