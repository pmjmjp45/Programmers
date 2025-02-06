class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        double num = arr.length;
        for (int x : arr) {
            sum += x;
        }
        answer = sum / num;
        return answer;
    }
}