import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        // int minLen = Integer.MAX_VALUE;
        // for (int i = 0; i < phone_book.length; i++) {
        //     minLen = Math.min(minLen, phone_book[i].length());
        // }
        // HashSet<String> set = new HashSet<>();
        // for (String phone : phone_book) {
        //     set.add(phone.substring(0, minLen));
        // }
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
            }
        }
        
        // if (set.size() != phone_book.length) {
        //     answer = false;
        // }
            
        return answer;
    }
}