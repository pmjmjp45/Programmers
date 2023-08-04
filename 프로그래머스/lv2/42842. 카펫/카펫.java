class Solution {
    public int[] solution(int brown, int yellow) {
        /*
        * 2x + 2y - 4 = brown
        * (x - 2)(y - 2) = yellow
        */
        int garo = 3;
        int sero = 3;
        while (garo <= 2500) {
            
            if (3 * garo - 4 >= brown - garo) {
                sero = (brown + 4 - (2 * garo)) / 2;
                while(true) {
                    if ((sero - 2) * (garo - 2) == yellow) {
                        break;
                    }
                    sero++;
                    garo = (brown + 4 - (2 * sero)) / 2;
                }
                break;
            }
            garo++;
        }
        
        //정렬해서 배열에 저장
        int max = Math.max(garo, sero);
        int min = Math.min(garo, sero);
        int[] answer = new int[2];
        answer[0] = max;
        answer[1] = min;
        return answer;
    }
}