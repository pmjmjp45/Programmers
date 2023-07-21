import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        ArrayList<String> baby = new ArrayList<>();
        
        for (String str : babbling) {
             //가능한 발음 초기화
            // HashMap<String, Integer> baby = new HashMap<>();
            // baby.put("aya", 0);baby.put("ye", 0);baby.put("woo", 0);baby.put("ma", 0);
            baby.clear();
            baby.add("aya");baby.add("ye");baby.add("woo");baby.add("ma");
            int hyphen = 0;
            // while(!baby.isEmpty()) {
            //     if (str.length() == 0) {
            //         answer++;
            //         break;
            //     } else {
            //         for (int i = 0; i < baby.size(); i++) {
            //             if (str.contains(baby.get(i))) {
            //                 str = str.replace(baby.get(i), "");
            //                 baby.remove(baby.get(i));
            //                 i = 0;
            //             } 
            //         }
            //     }
            // }
            
            
                for (int i = 0; i < baby.size(); i++) {
                    if (baby.size() == 0) {
                        break;
                    } else if (str.contains(baby.get(i))) {
                        System.out.println(str + "있음");
                        str = str.replace(baby.get(i), "_");
                        hyphen++;
                        
                        //baby.put(str2, 1);
                        baby.remove(baby.get(i));
                        System.out.println("str : " + str);
                        System.out.println("남은 baby : " + baby.toString());
                        i--;
                        
                        if (str.length() == hyphen) {
                            answer++;
                            System.out.println(answer);
                            break;
                        }
                        
                    }
                }
            }
        
        return answer;
    }
}