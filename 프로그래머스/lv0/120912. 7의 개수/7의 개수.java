class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        //array 모든 숫자에 대하여
        for (int num : array) {
            //숫자를 문자열로 변환, 배열에 한 글자씩 나눠서 저장
            String str = String.valueOf(num);
            String[] strArray = str.split("");
            
            //문자열 상태에서 7인지 확인
            for (String s : strArray) {
                if (s.equals("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}