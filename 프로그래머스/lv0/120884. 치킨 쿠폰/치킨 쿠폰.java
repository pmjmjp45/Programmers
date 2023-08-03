class Solution { 
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;
        while (true) {
            if (chicken < 10 && coupon < 10) {
                break;
            } else {
                coupon = chicken / 10;
                answer += coupon;
                chicken = coupon + chicken % 10;
            }
        }
        return answer;
    }
    
    // public static void getChicken(int chicken, int coupon) {
    //     if (chicken < 10 && coupon < 10) {
    //         return;
    //     } else {
    //         answer += chicken / 10;
    //         answer += coupon / 10;
    //         coupon = coupon % 10;
    //     }
    // }
}