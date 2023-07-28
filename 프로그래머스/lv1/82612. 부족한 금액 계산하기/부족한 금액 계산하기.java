class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = price * ((long)count * (count + 1) / 2);
        
        long answer = totalCost - money;
       
        if (answer < 0) {
            answer = 0;
        }
        return answer;
    }
}