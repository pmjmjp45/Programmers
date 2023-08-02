class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        int lenMy = my_string.length();
        int lenOver = overwrite_string.length();
        String answer = "";
        
        //인덱스 s까지 my_string
        for (int i = 0; i < s; i++) {
            answer += my_string.substring(i, i + 1);
        }
        
        //인덱스 s~lenOver까지 overWrite_string
        answer += overwrite_string;
          
        //인덱스 lenOver~lenMy my_string
        for (int i = s + lenOver; i < lenMy; i++) {
            answer += my_string.substring(i, i + 1);
        }
        return answer;
    }
}