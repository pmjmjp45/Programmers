class Solution {
    public int solution(int a, int b) {
        //기약분수로 만들기
        
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                a = a / i;
                b = b / i;
            }
        }
        
        //유한소수 판별
        int answer = 0;
        while (true) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else if (b == 1) {
                answer = 1;
                break;
            } else {
                answer = 2;
                break;
            }
        }
        return answer;
    }
}