class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        //int G = getG(denom1, denom2);
        int L = getL(denom1, denom2); // 최소공배수
        int newNumer = numer1 * (L / denom1) + numer2 * (L / denom2);
        
        //분수가 기약분수인지 확인
        int G = getG(L, newNumer);
        System.out.println("G : " + G);
        System.out.println("L : " + L);
        
        answer[1] = L / G;
        answer[0] = newNumer / G; 
        
         
        return answer;
    }
    //최소공배수 구하는 함수
    public static int getL(int denom1, int denom2) {
        int G = getG(denom1, denom2);
        return G * (denom1 / G) * (denom2 / G);
    }
    //최대공약수 구하는 함수
    public static int getG(int L, int newNumer) {
        int big = Math.max(L, newNumer);
        int small = Math.min(L, newNumer); 
        int G = 1;
        
        for (int i = small; i > 0; i--) {
            if (big % i == 0 && small % i == 0) {
                G = i;
                break;
            }
        }
        return G;
    }
}