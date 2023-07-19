import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        //"Kim"의 인덱스 찾기
        int index = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].contains("Kim")) {
                index = i;
                break;
            }
        }
        return "김서방은 " + index + "에 있다";
    }
}