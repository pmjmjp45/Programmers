class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        if(balls == share){
            return 1;
        }
        int min = Math.min(share, balls - share);
        for(int i = 1; i <= min; i++){
            answer = answer * balls;
            answer = answer / i;
            balls--;
        }
        return (int)answer;
    }
        
}