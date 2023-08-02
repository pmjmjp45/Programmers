class Solution {
    public String solution(String[] id_pw, String[][] db) {
        //입력한 아이디와 패스워드
        String inputId = id_pw[0];
        String inputPw = id_pw[1];
        
        //비교
        String answer = "";
        for (String[] arr : db) {
            if (arr[0].equals(inputId) && arr[1].equals(inputPw)) {
                answer = "login";
                break;
            } else if (arr[0].equals(inputId) && !arr[1].equals(inputPw)) {
                answer = "wrong pw";
                break;
            } else {
                answer = "fail";
            }
        }
        
        return answer;
    }
}