class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toUpperCase();
        
        String fndP = s.replaceAll("P", "");
        String fndY = s.replaceAll("Y", "");
        
        if (fndP.length() != fndY.length()) {
            answer = false;
        }
        
        return answer;
    }
}