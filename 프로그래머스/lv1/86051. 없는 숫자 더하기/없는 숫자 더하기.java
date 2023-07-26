import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        //배열 정렬
        Arrays.sort(numbers);
        
        //0~9까지 있는지 확인해서 answer에 더하기
        int answer = 0;
        int index = 0; // numbers의 인덱스
        
        for (int i = 0; i < 10; i++) {
            if (numbers[index] != i) {
                answer += i;
            } else if (index < numbers.length - 1){
                index++;
            }
        }
        
        return answer;
    }
}