class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        int number = 0; //자연수
        int numX = 0; // 변수 개수
        
        for (String str : arr) {
            if (str.contains("x")) { //변수인 경우
                if (str.length() == 1) {
                    numX++;
                } else {
                    numX += Integer.parseInt(str.substring(0, str.length() - 1));
                }
            } else if (!str.equals("+")) { //자연수인 경우
                number += Integer.parseInt(str);
            }  
        }        
        
        //x와 자연수 0인지, 1인지, 그 이상인지에 따라 결과값 달라짐
        String answer = "";
        if (numX == 1) {
            answer += "x";
        } else if (numX > 1) {
            answer += String.valueOf(numX) + "x";
        }
        
        if (numX >= 1 && number > 0) {
            answer += " + " + String.valueOf(number);
        } else if (numX == 0 && number > 0) {
            answer += String.valueOf(number);
        }
        
        return answer;
    }
}