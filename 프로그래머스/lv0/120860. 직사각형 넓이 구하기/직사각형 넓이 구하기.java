class Solution {
    public int solution(int[][] dots) {
        int garo = cal(dots, 0);
        int sero = cal(dots, 1);
        
        int answer = garo * sero;
        return answer;
    }
    
    public static int cal(int[][] dots, int index) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int[] x : dots) {
            max = Math.max(max, x[index]);
            min = Math.min(min, x[index]);
        }
        
        return max - min;
    } 
}